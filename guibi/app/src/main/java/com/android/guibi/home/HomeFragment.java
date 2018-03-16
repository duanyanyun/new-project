package com.android.guibi.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.guibi.R;

import static com.google.common.base.Preconditions.checkNotNull;


public class HomeFragment extends Fragment implements HomeContract.View {

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    private HomeContract.Presenter mPresenter;
    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView=inflater.inflate(R.layout.fragment_home, container, false);
        return mView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }


    @Override
    public void setTextValue(String val) {
        TextView textView= (TextView) mView.findViewById(R.id.text_v);
        textView.setText(val);
    }


}
