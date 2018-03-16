package com.android.guibi.home;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Administrator on 2018/3/9.
 */

public class HomePresenter implements HomeContract.Presenter {

    private final HomeContract.View mHomeView;

    public HomePresenter(@NonNull HomeContract.View homeView){
        mHomeView=checkNotNull(homeView,"homeView 为 null");
        mHomeView.setPresenter(this);
    }

    @Override
    public void start() {
        mHomeView.setTextValue("测试一下");
    }



}
