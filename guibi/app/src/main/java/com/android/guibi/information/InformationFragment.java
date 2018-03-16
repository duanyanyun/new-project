package com.android.guibi.information;

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
 * Use the {@link InformationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InformationFragment extends Fragment implements InformationContract.View {


    private InformationContract.Presenter mPresenter;
    private View mView;


    public static InformationFragment newInstance() {
        return new InformationFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView=inflater.inflate(R.layout.fragment_information, container, false);
        mPresenter.start();
        return mView;
    }

    @Override
    public void setTextValue(String val) {
        TextView textView=  mView.findViewById(R.id.information_text);
        textView.setText(val);

    }

    @Override
    public void setPresenter(InformationContract.Presenter presenter) {
        mPresenter=checkNotNull(presenter);
    }


}
