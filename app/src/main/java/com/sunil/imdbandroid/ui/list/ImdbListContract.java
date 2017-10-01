package com.sunil.imdbandroid.ui.list;

import com.sunil.imdbandroid.base.BaseContract;
import com.sunil.imdbandroid.db.model.IMBD;

import java.util.List;

/**
 * Created by sunil on 30-09-2017.
 */

public class ImdbListContract {

    public interface Presenter extends BaseContract.Presenter<View> {
        void loadImDbDb();
        void loadDetailImDb(boolean isDetail);
        long getCountDb();

    }

    public interface View extends BaseContract.View{
        void onImDbOk(List<IMBD> imbdList);
        void showLoadErrorMessage(String errorMsg);
        void showEmptyView(boolean isShow);

    }
}
