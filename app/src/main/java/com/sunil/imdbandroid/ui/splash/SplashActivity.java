package com.sunil.imdbandroid.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.sunil.imdbandroid.ui.list.MainActivity;
import com.sunil.imdbandroid.db.model.IMBD;
import com.sunil.imdbandroid.db.source.ImdbLocalSource;
import com.sunil.imdbandroid.util.Constant;

import java.util.List;

/**
 * Created by sunil on 30-09-2017.
 */

public class SplashActivity extends AppCompatActivity{

    private final static String TAG = SplashActivity.class.getSimpleName();

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 2000; // 2sec

    private ImdbLocalSource mCarLocalDataSource;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkDb();
    }

    private void timeOut(){
         /* New Handler to start the Home-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                startActivityHome();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    private void checkDb() {
        mCarLocalDataSource = new ImdbLocalSource();
        mCarLocalDataSource.getMovieCount();
        if ( mCarLocalDataSource.getMovieCount() <= 0) {
            List<IMBD> imbdList = Constant.getMoviesList();
            for (IMBD imbd : imbdList) {
                mCarLocalDataSource.saveMovies(imbd);
                Log.v(TAG, "Inserted");
            }
        }
        timeOut();
    }

    public void startActivityHome(){
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}
