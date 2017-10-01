package com.sunil.imdbandroid.base;

/**
 * Created by sunil on 30-09-2017.
 */

public class BaseContract {

    public interface Presenter<T>{
        void subscribe();
        void unSubscribe();
        void attachView(T view);
    }

    public interface View {

    }
}
