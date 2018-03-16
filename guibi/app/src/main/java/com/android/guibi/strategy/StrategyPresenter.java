package com.android.guibi.strategy;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Administrator on 2018/3/9.
 */

public class StrategyPresenter implements StrategyContract.Presenter {

    private final StrategyContract.View mStrategyView;

    public StrategyPresenter(@NonNull StrategyContract.View strategyView){
        mStrategyView=checkNotNull(strategyView,"strategyView 为 null");
        mStrategyView.setPresenter(this);
    }

    @Override
    public void start() {
        mStrategyView.setTextValue("测试一下V策略");
    }



}
