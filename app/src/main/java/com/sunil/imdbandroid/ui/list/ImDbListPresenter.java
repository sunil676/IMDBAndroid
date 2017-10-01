package com.sunil.imdbandroid.ui.list;

import android.support.annotation.NonNull;

import com.google.common.base.Preconditions;
import com.sunil.imdbandroid.db.model.IMBD;
import com.sunil.imdbandroid.db.source.ImdbLocalSource;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/**
 * Created by sunil on 30-09-2017.
 */

public class ImDbListPresenter implements ImdbListContract.Presenter{

    @NonNull
    private ImdbListContract.View mImdbView;

    private CompositeDisposable mCompositeDisposable;

    private ImdbLocalSource mImdbLocalDataSource;

    public ImDbListPresenter( ) {
        mImdbLocalDataSource = new ImdbLocalSource();
    }

    @Override
    public void subscribe() {
    }

    @Override
    public void unSubscribe() {
        mCompositeDisposable.clear();
    }

    @Override
    public void attachView(ImdbListContract.View view) {
        mImdbView = view;
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
    }

    @Override
    public void loadImDbDb() {
        loadFromDb();
    }

    @Override
    public void loadDetailImDb(boolean isDetail) {

    }

    @Override
    public long getCountDb() {
        return mImdbLocalDataSource.getMovieCount();
    }

    private void loadFromDb(){
        mCompositeDisposable.clear();
        Flowable<List<IMBD>> listFlowable = mImdbLocalDataSource.getImDBs();
        Disposable disposable =listFlowable.subscribe(new Consumer<List<IMBD>>() {
            @Override
            public void accept(@io.reactivex.annotations.NonNull List<IMBD> kickStarters) throws Exception {
                mImdbView.onImDbOk(kickStarters);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(@io.reactivex.annotations.NonNull Throwable throwable) throws Exception {
                Preconditions.checkNotNull(throwable);
                mImdbView.showLoadErrorMessage(throwable.getMessage());
            }
        }, new Action() {
            @Override
            public void run() throws Exception {
                // mKickStartView.onLoadFinish();
            }
        });
        mCompositeDisposable.add(disposable);
    }
}
