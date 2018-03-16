package com.android.guibi.information;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Administrator on 2018/3/9.
 */

public class InformationPresenter implements InformationContract.Presenter {

    private final InformationContract.View mInformationView;

    public InformationPresenter(@NonNull InformationContract.View informationView){
        mInformationView=checkNotNull(informationView,"informationView 为 null");
        mInformationView.setPresenter(this);
    }

    @Override
    public void start() {
        mInformationView.setTextValue("测试一下Information");
    }



}
