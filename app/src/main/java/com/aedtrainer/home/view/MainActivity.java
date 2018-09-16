package com.aedtrainer.home.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.aedtrainer.R;
import com.aedtrainer.base.BaseActivity;
import com.aedtrainer.util.IntentUtils;
import com.aedtrainer.util.Tools;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.btn_activate1)
    protected Button btnActivate1;
    @BindView(R.id.btn_activate2)
    protected Button btnActivate2;
    @BindView(R.id.btn_activate3)
    protected Button btnActivate3;
    @BindView(R.id.btn_activate4)
    protected Button btnActivate4;
    @BindView(R.id.ll_mairui)
    protected LinearLayout llMairui;
    @BindView(R.id.ll_lifepak)
    protected LinearLayout llLifepak;
    @BindView(R.id.ll_kohden)
    protected LinearLayout llKohden;
    @BindView(R.id.ll_phlips)
    protected LinearLayout llPhlips;
    @BindView(R.id.ll_zoll)
    protected LinearLayout llZoll;
    @BindView(R.id.ll_more)
    protected LinearLayout llMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        Tools.initConfig(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {
        llMairui.setOnClickListener(this);
        llLifepak.setOnClickListener(this);
        llKohden.setOnClickListener(this);
        llPhlips.setOnClickListener(this);
        llZoll.setOnClickListener(this);
        llMore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_mairui:
                //跳转到体验页面
                IntentUtils.getInstence().intent(this,ExperienceActivity.class);
                break;
            case R.id.ll_lifepak:
                //去激活页面
                IntentUtils.getInstence().intent(this,ActivationActivity.class);
                break;
            case R.id.ll_kohden:
                //去激活页面
                IntentUtils.getInstence().intent(this,ActivationActivity.class);
                break;
            case R.id.ll_phlips:
                //去激活页面
                IntentUtils.getInstence().intent(this,ActivationActivity.class);
                break;
            case R.id.ll_zoll:
                //去激活页面
                IntentUtils.getInstence().intent(this,ActivationActivity.class);
                break;
            case R.id.ll_more:
                //去更多界面
                IntentUtils.getInstence().intent(this,MoreActivity.class);
                break;
        }

    }
}
