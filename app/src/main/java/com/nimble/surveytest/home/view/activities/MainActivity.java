package com.nimble.surveytest.home.view.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.nimble.surveytest.R;
import com.nimble.surveytest.App;
import com.nimble.surveytest.home.view.fragments.MainFragment;
import com.nimble.surveytest.utils.EventBusManager;

public class MainActivity extends BaseActivity implements View.OnClickListener{
    static public final String ACTION_MENU_BTN = "ACTION_MENU_BTN";
    static public final String ACTION_REFRESH_BTN = "ACTION_REFRESH_BTN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add main fragment
        replaceFragment(R.id.activity_main_content_frame, MainFragment.getInstance());

        //Set up appbar
        setupAppbar();
    }

    private void setupAppbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(toolbar);

        View customViewAppBar = App.inflater.inflate(R.layout.toolbar_main, null);
        getSupportActionBar().setCustomView(customViewAppBar, new Toolbar.LayoutParams(Toolbar.LayoutParams.MATCH_PARENT, Toolbar.LayoutParams.MATCH_PARENT));
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        toolbar.findViewById(R.id.toolbar_main_menu_btn).setOnClickListener(this);
        toolbar.findViewById(R.id.toolbar_main_refresh_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.toolbar_main_menu_btn:
                EventBusManager.getOttoManager().post(ACTION_MENU_BTN);
                break;
            case R.id.toolbar_main_refresh_btn:
                EventBusManager.getOttoManager().post(ACTION_REFRESH_BTN);
                break;
        }
    }
}
