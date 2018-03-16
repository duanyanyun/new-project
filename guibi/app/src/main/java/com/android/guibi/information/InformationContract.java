package com.android.guibi.information;

import com.android.guibi.BasePresenter;
import com.android.guibi.BaseView;

/**
 * Created by Administrator on 2018/3/9.
 */

public interface InformationContract {

    interface View extends BaseView<Presenter> {

        void  setTextValue(String val);
    }

    interface Presenter extends BasePresenter {

    }


}
