package com.sunil.imdbandroid.ui.list;

import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.sunil.imdbandroid.MainApplication;
import com.sunil.imdbandroid.R;
import com.sunil.imdbandroid.adapter.ImDbAdapter;
import com.sunil.imdbandroid.db.model.IMBD;
import com.sunil.imdbandroid.di.component.ApplicationComponent;
import com.sunil.imdbandroid.di.component.DaggerImdbListComponent;
import com.sunil.imdbandroid.di.component.ImdbListComponent;
import com.sunil.imdbandroid.di.module.ImdbListModule;
import com.sunil.imdbandroid.util.ChromeTabActionBroadcastReceiver;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sunil on 30-09-2017.
 */

public class ImdbListFragment extends Fragment implements ImdbListContract.View, ImDbAdapter.onItemClickListener, SearchView.OnQueryTextListener{

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Inject
    ImdbListContract.Presenter mPresenter;
    private ImDbAdapter mImDbAdapter;
    private List<IMBD> mListImDb;

    public static ImdbListFragment newInstance() {
        return new ImdbListFragment();
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.subscribe();
    }

    @Override
    public void onPause() {
        super.onPause();
        mPresenter.unSubscribe();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // do things if you want to create only first time when activity created.
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependency();
        mPresenter.attachView(this);
        setHasOptionsMenu(true);
    }

    private void injectDependency() {
        ApplicationComponent applicationComponent = ((MainApplication) getActivity().getApplication()).getApplicationComponent();
        ImdbListComponent imdbListComponent = DaggerImdbListComponent.builder()
                .applicationComponent(applicationComponent)
                .imdbListModule(new ImdbListModule())
                .build();
        imdbListComponent.inject(this);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_imdb_list, container, false);
        ButterKnife.bind(this, root);
        if (mPresenter != null) {
            if (mPresenter.getCountDb() > 0) {
                mPresenter.loadImDbDb();
            } else {
                Log.v("", "Error in loading.");
            }
        }

        return root;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);

        final MenuItem item = menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(this);

        MenuItemCompat.setOnActionExpandListener(item,
                new MenuItemCompat.OnActionExpandListener() {
                    @Override
                    public boolean onMenuItemActionCollapse(MenuItem item) {
                    // Do something when collapsed
                        mImDbAdapter.setSearchResult(mListImDb);
                        return true; // Return true to collapse action view
                    }

                    @Override
                    public boolean onMenuItemActionExpand(MenuItem item) {
                    // Do something when expanded
                        return true; // Return true to expand action view
                    }
                });
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        final List<IMBD> filteredModelList = filter(mListImDb, newText);
        mImDbAdapter.setSearchResult(filteredModelList);
        return true;
    }

    private List<IMBD> filter(List<IMBD> models, String query) {
        query = query.toLowerCase();
        final List<IMBD> filteredModelList = new ArrayList<>();
        for (IMBD model : models) {
            final String text = model.getName().toLowerCase();
            if (text.contains(query)) {
                filteredModelList.add(model);
            }
        }
        return filteredModelList;
    }

    @Override
    public void onImDbOk(List<IMBD> imbdList) {
        mListImDb = imbdList;
        mImDbAdapter = new ImDbAdapter(getActivity(), imbdList, this);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setAdapter(mImDbAdapter);
    }

    @Override
    public void showLoadErrorMessage(String errorMsg) {
        Toast.makeText(getActivity(), errorMsg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showEmptyView(boolean isShow) {
        // show error view if any
    }

    @Override
    public void itemDetailClick(IMBD imbd) {
        // create the fragment here
        String  imbdDetailLink = imbd.getDetailLink();
        String name = imbd.getName();
        Uri uri = Uri.parse(imbdDetailLink);
        openCustomChromeTab(uri, name);
    }

    public void  openCustomChromeTab(Uri uri, String name){

        // create an intent builder
        CustomTabsIntent.Builder intentBuilder = new CustomTabsIntent.Builder();

        // Begin customizing
        // set toolbar colors
        intentBuilder.setShowTitle(true);
        intentBuilder.setToolbarColor(ContextCompat.getColor(getActivity(), R.color.colorPrimary));
        intentBuilder.setSecondaryToolbarColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryDark));

        //Setting a custom back button
        intentBuilder.setCloseButtonIcon(BitmapFactory.decodeResource(
                getResources(), R.drawable.ic_arrow_back));

        // set start and exit animations
        intentBuilder.setStartAnimations(getActivity(), R.anim.slide_in_right, R.anim.slide_out_left);
        intentBuilder.setExitAnimations(getActivity(), android.R.anim.slide_in_left,
                android.R.anim.slide_out_right);

        // build custom tabs intent
        CustomTabsIntent customTabsIntent = intentBuilder.build();

        // launch the url
        customTabsIntent.launchUrl(getActivity(), uri);
    }

}
