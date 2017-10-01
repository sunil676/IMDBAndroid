package com.sunil.imdbandroid;

import android.app.Application;
import android.content.Context;

import com.sunil.imdbandroid.db.GreenDaoDatabase;
import com.sunil.imdbandroid.di.component.ApplicationComponent;
import com.sunil.imdbandroid.di.component.DaggerApplicationComponent;
import com.sunil.imdbandroid.di.module.ApplicationModule;

/**
 * Created by sunil on 30-09-2017.
 */

public class MainApplication extends Application {

    protected ApplicationComponent mApplicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        setupInjector();
        GreenDaoDatabase.getInstance().init(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    private void setupInjector() {
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);
    }

    public static MainApplication get(Context context) {
        return (MainApplication) context.getApplicationContext();
    }
}