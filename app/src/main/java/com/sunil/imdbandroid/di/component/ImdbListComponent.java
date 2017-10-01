package com.sunil.imdbandroid.di.component;

import com.sunil.imdbandroid.di.module.ImdbListModule;
import com.sunil.imdbandroid.di.scope.PerActivity;
import com.sunil.imdbandroid.ui.list.ImdbListFragment;

import dagger.Component;

/**
 * Created by sunil on 30-09-2017.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ImdbListModule.class)
public interface ImdbListComponent {
    void inject(ImdbListFragment imdbListFragment);
}
