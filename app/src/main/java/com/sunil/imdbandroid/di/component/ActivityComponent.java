package com.sunil.imdbandroid.di.component;

import com.sunil.imdbandroid.ui.list.MainActivity;
import com.sunil.imdbandroid.di.module.ActivityModule;
import com.sunil.imdbandroid.di.scope.PerActivity;

import dagger.Component;

/**
 * Created by sunil on 30-09-2017.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
