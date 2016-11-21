package com.nimble.surveytest.home.view.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nimble.surveytest.R;
import com.nimble.surveytest.databinding.FragmentSurveyItemBinding;
import com.nimble.surveytest.home.model.entities.Survey;
import com.nimble.surveytest.home.viewmodel.SurveyViewModel;

/**
 * Survey fragment is representing for each page in view pager
 * Created by Apple on 11/19/16.
 */
public class SurveyFragment extends BaseFragment {
    private Survey survey;
    private SurveyViewModel surveyViewModel;
    static public SurveyFragment getInstance(){
        SurveyFragment surveyFragment = new SurveyFragment();
        return surveyFragment;
    }

    public void setSurvey(Survey survey){
        this.survey = survey;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSurveyItemBinding fragmentSurveyItemBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_survey_item, container, false);
        View root = fragmentSurveyItemBinding.getRoot();

        //Create survey view model
        surveyViewModel = new SurveyViewModel(getContext(), survey);
        fragmentSurveyItemBinding.setViewModel(surveyViewModel);

        return root;
    }

    @Override
    public void onDestroyView() {
        surveyViewModel.destroy();
        super.onDestroyView();
    }

    @Override
    protected String setTagName() {
        return SurveyFragment.class.getSimpleName();
    }
}
