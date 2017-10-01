package com.sunil.imdbandroid.db.source;

import android.support.annotation.NonNull;
import android.util.Log;

import com.sunil.imdbandroid.db.GreenDaoDatabase;
import com.sunil.imdbandroid.db.model.IMBD;
import com.sunil.imdbandroid.db.model.IMBDDao;

import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Flowable;
import io.reactivex.Observable;

/**
 * Created by sunil on 30-09-2017.
 */

public class ImdbLocalSource implements ImdbSource {

    private final  static String TAG = ImdbLocalSource.class.getSimpleName();

    private IMBDDao getIMBDDao() {
        return GreenDaoDatabase.getInstance().getDaoSession().getIMBDDao();
    }

    @Override
    public Flowable<List<IMBD>> getImDBs() {
        return Flowable.fromCallable(new Callable<List<IMBD>>() {
            @Override
            public List<IMBD> call() throws Exception {
                List<IMBD> list = getIMBDDao().loadAll();
                Log.d(TAG, "getImDBs: " + list.size());
                return list;
            }
        });
    }

    @Override
    public Observable<IMBD> getMovieById(final String deatilLink) {
        return Observable.fromCallable(new Callable<IMBD>() {
            @Override
            public IMBD call() throws Exception {
                IMBD imbd  = getIMBDDao().queryBuilder()
                        .where(IMBDDao.Properties.DetailLink.eq(deatilLink)).unique();
                return imbd;
            }

        });
    }

    @Override
    public void saveMovies(@NonNull IMBD imbd) {
        getIMBDDao().insertOrReplace(imbd);
    }

    @Override
    public void deleteMovie(@NonNull IMBD imbd) {
        getIMBDDao().delete(imbd);
    }

    @Override
    public long getMovieCount() {
        return getIMBDDao().count();
    }
}
