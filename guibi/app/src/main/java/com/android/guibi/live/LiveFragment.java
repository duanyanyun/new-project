package com.android.guibi.live;

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
 * Use the {@link LiveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LiveFragment extends Fragment implements LiveContract.View {


    private LiveContract.Presenter mPresenter;
    private View mView;

    public static LiveFragment newInstance() {
        return new LiveFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView=inflater.inflate(R.layout.fragment_live, container, false);
        mPresenter.start();
        return mView;
    }

    @Override
    public void setTextValue(String val) {
        TextView textView=  mView.findViewById(R.id.live_text);
        textView.setText(val);

    }

    @Override
    public void setPresenter(LiveContract.Presenter presenter) {
        mPresenter=checkNotNull(presenter);
    }


}
