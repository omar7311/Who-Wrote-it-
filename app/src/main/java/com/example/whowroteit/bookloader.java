package com.example.whowroteit;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class bookloader extends AsyncTaskLoader<String> {
    private String myQueryString;
    public bookloader(@NonNull Context context,String myQueryString) {
        super(context);
        this.myQueryString=myQueryString;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(myQueryString);
    }
}
