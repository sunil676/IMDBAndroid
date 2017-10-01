package com.sunil.imdbandroid.di.module;

import android.app.Application;

import com.sunil.imdbandroid.MainApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sunil on 30-09-2017.
 */

@Module
public class ApplicationModule {

    private final MainApplication mainApplication;

    public ApplicationModule(MainApplication mainApplication) {
        this.mainApplication = mainApplication;
    }

    @Provides
    public Application provideApplication() {
        return mainApplication;
    }

}
