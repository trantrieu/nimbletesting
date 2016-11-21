package com.nimble.surveytest.home.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.nimble.surveytest.home.model.entities.Survey;
import com.nimble.surveytest.home.view.fragments.SurveyFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Apple on 11/19/16.
 */

public class SurveyAdapter extends FragmentPagerAdapter {
    private List<Survey> list = new ArrayList<>();
    public SurveyAdapter(FragmentManager fm) {
        super(fm);
    }

    public void updateList(List<Survey> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        Survey survey = list.get(position);
        SurveyFragment surveyFragment = SurveyFragment.getInstance(survey);
        return surveyFragment;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
