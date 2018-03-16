package com.android.guibi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.guibi.R;
import com.android.guibi.home.HomeFragment;
import com.android.guibi.home.HomePresenter;
import com.android.guibi.information.InformationFragment;
import com.android.guibi.information.InformationPresenter;
import com.android.guibi.live.LiveFragment;
import com.android.guibi.live.LivePresenter;
import com.android.guibi.strategy.StrategyFragment;
import com.android.guibi.strategy.StrategyPresenter;
import com.android.guibi.user.UserFragment;
import com.android.guibi.user.UserPresenter;
import com.android.guibi.util.ActivityUtils;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private HomePresenter mHomePresenter;
    private LivePresenter mLivePresenter;
    private StrategyPresenter mStrategyPresenter;
    private UserPresenter mUserPresenter;
    private InformationPresenter mInformationPresenter;

    private HomeFragment homeFragment;
    private LiveFragment liveFragment;
    private StrategyFragment strategyFragment;
    private UserFragment userFragment;
    private InformationFragment informationFragment;
    private int tebIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction=hideFragment();
        if (homeFragment == null) {
            homeFragment = HomeFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), homeFragment, R.id.contentFrame);
            mHomePresenter=new HomePresenter(homeFragment);
        }else {
            fragmentTransaction.show(homeFragment);
        }
        fragmentTransaction.commit();

    }

    public void homeClick(View view) {
        if(tebIndex==1){
            return;
        }
        FragmentTransaction fragmentTransaction=hideFragment();
        if (homeFragment == null) {
            homeFragment = HomeFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), homeFragment, R.id.contentFrame);
            mHomePresenter=new HomePresenter(homeFragment);
        }else {
            fragmentTransaction.show(homeFragment);
        }
        tebIndex=1;
        fragmentTransaction.commit();
    }

    public void personClick(View view) {
        if(tebIndex==5){
            return;
        }
        FragmentTransaction fragmentTransaction=hideFragment();
        if (userFragment == null) {
            userFragment = UserFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), userFragment, R.id.contentFrame);
            mUserPresenter=new UserPresenter(userFragment);
        }else {
            fragmentTransaction.show(userFragment);
        }
        tebIndex=5;
        fragmentTransaction.commit();
    }

    public void informationClick(View view) {
        if(tebIndex==4){
            return;
        }
        FragmentTransaction fragmentTransaction=hideFragment();
        if (informationFragment == null) {
            informationFragment = InformationFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), informationFragment, R.id.contentFrame);
            mInformationPresenter=new InformationPresenter(informationFragment);
        }else {
            fragmentTransaction.show(informationFragment);
        }
        tebIndex=4;
        fragmentTransaction.commit();

    }

    public void strategyClick(View view) {
        if(tebIndex==3){
            return;
        }
        FragmentTransaction fragmentTransaction=hideFragment();
        if (strategyFragment == null) {
            strategyFragment = StrategyFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), strategyFragment, R.id.contentFrame);
            mStrategyPresenter=new StrategyPresenter(strategyFragment);
        }else {
            fragmentTransaction.show(strategyFragment);
        }
        tebIndex=3;
        fragmentTransaction.commit();
    }

    public void liveClick(View view) {
        if(tebIndex==2){
            return;
        }
        FragmentTransaction fragmentTransaction=hideFragment();
        if (liveFragment == null) {
            liveFragment = LiveFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), liveFragment, R.id.contentFrame);
            mLivePresenter=new LivePresenter(liveFragment);
        }else {
            fragmentTransaction.show(liveFragment);
        }
        tebIndex=2;
        fragmentTransaction.commit();

    }

    private FragmentTransaction hideFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        List<Fragment> fragments = fragmentManager.getFragments();
        for (Fragment fragment : fragments) {
            fragmentTransaction.hide(fragment);
        }
        return fragmentTransaction ;
    }


}
