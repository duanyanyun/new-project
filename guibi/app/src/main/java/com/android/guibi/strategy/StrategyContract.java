package com.android.guibi.strategy;

import com.android.guibi.BasePresenter;
import com.android.guibi.BaseView;

/**
 * Created by Administrator on 2018/3/9.
 */

public interface StrategyContract {

    interface View extends BaseView<Presenter> {

        void  setTextValue(String val);
    }

    interface Presenter extends BasePresenter {

    }


}
