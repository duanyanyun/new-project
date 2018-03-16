package com.android.guibi.live;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Administrator on 2018/3/9.
 */

public class LivePresenter implements LiveContract.Presenter {

    private final LiveContract.View mLiveView;

    public LivePresenter(@NonNull LiveContract.View liveView){
        mLiveView=checkNotNull(liveView,"liveView 为 null");
        mLiveView.setPresenter(this);
    }

    @Override
    public void start() {
        mLiveView.setTextValue("测试一下Live");
    }



}
