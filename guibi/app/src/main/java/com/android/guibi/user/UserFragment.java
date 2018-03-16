package com.android.guibi.user;

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
 * Use the {@link UserFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UserFragment extends Fragment implements UserContract.View {


    private UserContract.Presenter mPresenter;
    private View mView;

    public static UserFragment newInstance() {
        return new UserFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView=inflater.inflate(R.layout.fragment_user, container, false);
        mPresenter.start();
        return mView;
    }

    @Override
    public void setTextValue(String val) {
        TextView textView=  mView.findViewById(R.id.user_text);
        textView.setText(val);

    }

    @Override
    public void setPresenter(UserContract.Presenter presenter) {
        mPresenter=checkNotNull(presenter);
    }


}
