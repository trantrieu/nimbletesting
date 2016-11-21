package com.nimble.surveytest.home.viewmodel;

import android.content.Context;
import android.databinding.ObservableInt;
import android.view.View;

import com.nimble.surveytest.R;
import com.nimble.surveytest.home.model.datalayers.ImplementSurveyRepository;
import com.nimble.surveytest.home.model.datalayers.SurveyRepository;
import com.nimble.surveytest.home.model.entities.Survey;
import com.nimble.surveytest.home.view.activities.MainActivity;
import com.nimble.surveytest.utils.EventBusManager;
import com.squareup.otto.Subscribe;

import java.util.List;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Main view model is representing for state of view of main fragment
 * Created by Apple on 11/19/16.
 */

public class MainViewModel implements ViewModel {

    private InfoViewModel infoViewModel;

    public ObservableInt infoViewVisibility;
    public ObservableInt contentViewVisibility;

    private Context context;
    private MainFragmentListener mainFragmentListener;
    private Subscription subscription;
    private SurveyRepository surveyRepository;

    public MainViewModel(Context context, InfoViewModel infoViewModel, MainFragmentListener mainFragmentListener) {
        this.context = context;
        this.infoViewModel = infoViewModel;
        this.mainFragmentListener = mainFragmentListener;
        infoViewVisibility = new ObservableInt(View.VISIBLE);
        contentViewVisibility = new ObservableInt(View.GONE);

        EventBusManager.getOttoManager().register(this);
        surveyRepository = new ImplementSurveyRepository();
        refreshListSurvey();
    }

    /**
     * Receive action pressed
     * @param action
     */
    @Subscribe
    public void onActionEvent(String action){
        if(action.equals(MainActivity.ACTION_MENU_BTN)){

        }else if(action.equals(MainActivity.ACTION_REFRESH_BTN)){
            refreshListSurvey();
        }
    }

    /**
     * Fetch new survey list
     */
    protected void refreshListSurvey(){
        showInfoView();
        infoViewModel.showLoading();
        subscription = surveyRepository.provideSurveyRepository(1, 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<Survey>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        infoViewModel.showError(e.getMessage(), e);
                    }

                    @Override
                    public void onNext(List<Survey> surveys) {
                        if(surveys.isEmpty()){
                            infoViewModel.showInformation(context.getString(R.string.empty_result));
                        }else{
                            showContent();
                            mainFragmentListener.onDataFetched(surveys);
                        }
                    }
                });
    }

    /**
     * Show information view
     * Hide list view
     */
    protected void showInfoView(){
        infoViewVisibility.set(View.VISIBLE);
        contentViewVisibility.set(View.GONE);
    }

    /**
     * Hide information view
     * Show list view
     */
    protected void showContent(){
        infoViewVisibility.set(View.GONE);
        contentViewVisibility.set(View.VISIBLE);
    }

    @Override
    public void destroy() {
        if(subscription != null){
            subscription.unsubscribe();
        }
        EventBusManager.getOttoManager().unregister(this);
    }

    public interface MainFragmentListener{
        void onDataFetched(List<Survey> list);
    }
}
