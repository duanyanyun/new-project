package com.android.guibi.home;

import com.android.guibi.BasePresenter;
import com.android.guibi.BaseView;

/**
 * Created by Administrator on 2018/3/9.
 */

public interface HomeContract {

    interface View extends BaseView<Presenter> {

        void  setTextValue(String val);
    }

    interface Presenter extends BasePresenter {

    }


}
