package com.android.guibi.strategy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.guibi.R;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link StrategyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StrategyFragment extends Fragment implements StrategyContract.View {


    private StrategyContract.Presenter mPresenter;
    private View mView;

    public static StrategyFragment newInstance() {
        return new StrategyFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView=inflater.inflate(R.layout.fragment_strategy, container, false);
        mPresenter.start();
        return mView;
    }

    @Override
    public void setTextValue(String val) {
        TextView textView=  mView.findViewById(R.id.strategy_text);
        textView.setText(val);

    }

    @Override
    public void setPresenter(StrategyContract.Presenter presenter) {
        mPresenter=checkNotNull(presenter);
    }


}
