package com.nimble.surveytest.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.nimble.surveytest.R;
import com.nimble.surveytest.home.model.entities.Survey;
import com.nimble.surveytest.home.view.activities.BaseActivity;

/**
 * Created by Apple on 11/19/16.
 */

public class DetailActivity extends BaseActivity {

    static public Intent createDetailActivityIntent(Context context, Survey survey){
        Intent intent = new Intent(context, DetailActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
