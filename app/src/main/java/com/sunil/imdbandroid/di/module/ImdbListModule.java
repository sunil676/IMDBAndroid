package com.sunil.imdbandroid.di.module;

import com.sunil.imdbandroid.ui.list.ImDbListPresenter;
import com.sunil.imdbandroid.ui.list.ImdbListContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sunil on 30-09-2017.
 */
@Module
public class ImdbListModule {
    @Provides
    ImdbListContract.Presenter getCarPresenter() {
        return new ImDbListPresenter();
    }
}
