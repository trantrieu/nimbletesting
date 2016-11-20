package com.nimble.surveytest.home.view.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.nimble.surveytest.R;
import com.nimble.surveytest.databinding.FragmentMainBinding;
import com.nimble.surveytest.databinding.LayoutInformationBinding;
import com.nimble.surveytest.home.model.entities.Survey;
import com.nimble.surveytest.home.view.adapter.SurveyAdapter;
import com.nimble.surveytest.home.view.customviews.viewpageindicator.CirclePageIndicator;
import com.nimble.surveytest.home.view.customviews.viewpageindicator.VerticalViewPager;
import com.nimble.surveytest.home.viewmodel.InfoViewModel;
import com.nimble.surveytest.home.viewmodel.MainViewModel;

import java.util.List;

/**
 * Created by Apple on 11/19/16.
 */

public class MainFragment extends BaseFragment implements MainViewModel.MainFragmentListener{
    private FragmentMainBinding fragmentMainBinding;
    private MainViewModel mainViewModel;
    private InfoViewModel infoViewModel;
    private SurveyAdapter surveyAdapter;

    private CirclePageIndicator circlePageIndicator;
    private VerticalViewPager verticalViewPager;

    static public MainFragment getInstance(){
        MainFragment mainFragment = new MainFragment();
        return mainFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentMainBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        View view = fragmentMainBinding.getRoot();

        //set up info view binding
        setupInfoViewBinding(inflater, view);

        //Set view model to bindding tool
        mainViewModel = new MainViewModel(getContext(), infoViewModel, this);
        fragmentMainBinding.setViewModel(mainViewModel);

        //bind this view to this MainFragment
        circlePageIndicator = (CirclePageIndicator) view.findViewById(R.id.fragment_main_indicator);
        verticalViewPager = (VerticalViewPager) view.findViewById(R.id.fragment_main_pager);

        //setup pager
        setupPager();

        return view;
    }

    private void setupInfoViewBinding(LayoutInflater inflater, View root){
        infoViewModel = new InfoViewModel();
        LayoutInformationBinding layoutInformationBinding = DataBindingUtil.inflate(inflater, R.layout.layout_information, null, false);
        layoutInformationBinding.setViewModel(infoViewModel);
        ((FrameLayout)root.findViewById(R.id.fragment_main_info_view)).addView(layoutInformationBinding.getRoot());
    }

    private void setupPager(){
        surveyAdapter = new SurveyAdapter(getFragmentManager());
        verticalViewPager.setAdapter(surveyAdapter);
        circlePageIndicator.setViewPager(verticalViewPager);
        circlePageIndicator.setOrientation(LinearLayout.VERTICAL);
    }

    @Override
    public void onDestroyView() {
        infoViewModel.destroy();
        mainViewModel.destroy();
        super.onDestroyView();
    }

    @Override
    protected String setTagName() {
        return MainFragment.class.getSimpleName();
    }

    @Override
    public void onDataFetched(List<Survey> list) {
        surveyAdapter.updateList(list);

        /**
         * Move viewpager to first position
         */
        if(list.size() > 0) {
            verticalViewPager.setCurrentItem(0);
        }
    }
}
