package com.nimble.surveytest.home.viewmodel;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;

import com.nimble.surveytest.home.view.activities.MainActivity;
import com.nimble.surveytest.utils.EventBusManager;

/**
 * Created by Apple on 11/19/16.
 */

public class InfoViewModel implements ViewModel {

    public ObservableInt progressVisibility;
    public ObservableInt infoTxtVisibility;
    public ObservableInt errorVisibility;

    public ObservableField<String> informationText;
    public ObservableField<String> errorText;
    public InfoViewModel() {
        progressVisibility = new ObservableInt(View.VISIBLE);
        infoTxtVisibility = new ObservableInt(View.GONE);
        errorVisibility = new ObservableInt(View.GONE);

        informationText = new ObservableField<>("");
        errorText = new ObservableField<>("");
    }

    public void showLoading(){
        progressVisibility.set(View.VISIBLE);
        infoTxtVisibility.set(View.GONE);
        errorVisibility.set(View.GONE);
    }

    public void showInformation(String information){
        progressVisibility.set(View.GONE);
        infoTxtVisibility.set(View.VISIBLE);
        errorVisibility.set(View.GONE);
        informationText.set(information);
    }

    public void showError(String message, Throwable throwable){
        progressVisibility.set(View.GONE);
        infoTxtVisibility.set(View.GONE);
        errorVisibility.set(View.VISIBLE);
        errorText.set(message);
    }

    public void onErrorButtonClick(View view){
        EventBusManager.getOttoManager().post(MainActivity.ACTION_REFRESH_BTN);
    }

    @Override
    public void destroy() {

    }
}
