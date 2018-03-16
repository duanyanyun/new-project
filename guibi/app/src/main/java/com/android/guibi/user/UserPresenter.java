package com.android.guibi.user;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Administrator on 2018/3/9.
 */

public class UserPresenter implements UserContract.Presenter {

    private final UserContract.View mUserView;

    public UserPresenter(@NonNull UserContract.View userView){
        mUserView=checkNotNull(userView,"userView 为 null");
        mUserView.setPresenter(this);
    }

    @Override
    public void start() {
        mUserView.setTextValue("测试一下User");
    }



}
