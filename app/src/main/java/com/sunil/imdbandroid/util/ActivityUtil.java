package com.sunil.imdbandroid.util;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;

import com.google.common.base.Preconditions;

/**
 * Created by sunil on 30-09-2017.
 */

public class ActivityUtil {

    public static void addFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                             @NonNull Fragment fragment, int frameId, String fragmentTag) {
        Preconditions.checkNotNull(fragmentManager);
        Preconditions.checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(frameId, fragment, fragmentTag);
        transaction.commit();
    }
}