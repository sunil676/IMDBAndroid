package com.sunil.imdbandroid.db.source;

import android.support.annotation.NonNull;

import com.sunil.imdbandroid.db.model.IMBD;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;

/**
 * Created by sunil on 30-09-2017.
 */

public interface ImdbSource {

    Flowable<List<IMBD>> getImDBs();

    Observable<IMBD> getMovieById(String movieId);

    void saveMovies(@NonNull IMBD imbd);

    void deleteMovie(@NonNull IMBD imbd);

    long getMovieCount();
}
