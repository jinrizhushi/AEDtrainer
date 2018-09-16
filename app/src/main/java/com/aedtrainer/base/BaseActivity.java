package com.aedtrainer.base;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.aedtrainer.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by bamboo on 2018/9/16.
 */
public abstract class BaseActivity extends Activity implements View.OnClickListener {
    private Unbinder unbinder;
    protected FrameLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initView();
        initEvent();
        initData();
    }
    /**
     * 获取页面的xml
     * @return
     */
    protected abstract int getLayout();
    protected void initView(){

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
        mContainer = findViewById(R.id.container);
        mContainer.addView(View.inflate(this,getLayout(),null));
        unbinder = ButterKnife.bind(this);
    }
    /**
     * 处理数据的方法
     */
    protected abstract void initData() ;
    /**
     * 处理事件的方法
     */
    protected abstract void initEvent() ;
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }


}
