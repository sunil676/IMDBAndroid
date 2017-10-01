package com.sunil.imdbandroid.di.component;

import android.app.Application;

import com.sunil.imdbandroid.MainApplication;
import com.sunil.imdbandroid.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sunil on 30-09-2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MainApplication mainApplication);

    Application getApplication();

}
