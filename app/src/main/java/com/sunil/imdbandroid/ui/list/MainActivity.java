package com.sunil.imdbandroid.ui.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sunil.imdbandroid.R;
import com.sunil.imdbandroid.ui.list.ImdbListFragment;
import com.sunil.imdbandroid.util.ActivityUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            // create the fragment here
            ActivityUtil.addFragmentToActivity(getFragmentManager(), ImdbListFragment.newInstance(), R.id.frame_content, "ImdbListFragment");
        }
    }
}
