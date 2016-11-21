package com.nimble.surveytest.home.view.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.nimble.surveytest.App;
import com.nimble.surveytest.home.view.dialogs.DialogCreator;

import static com.nimble.surveytest.home.view.dialogs.DialogCreator.showDialogMessage;

/**
 * Created by Trieu on 7/26/2016.
 */
public abstract class BaseFragment extends Fragment {

    private String tagName;

    protected BaseFragment(){
        tagName = setTagName();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    public String getTagName(){
        return tagName;
    }

    protected abstract String setTagName();

    @Override public void onDestroy() {
        super.onDestroy();
        App.getRefWatcher().watch(this);
    }

    public void showDialog(String title, String message, DialogInterface.OnClickListener onClickListener){
        DialogCreator.showDialogMessage(getActivity(), title, message, onClickListener);
    }

    public void showToast(String message){
        com.nimble.surveytest.home.view.dialogs.DialogCreator.showToast(getActivity(), message);
    }

    public void showDialog(int title, int message, DialogInterface.OnClickListener onClickListener){
        showDialogMessage(getActivity(), title, message, onClickListener);
    }

    public void showToast(int message){
        com.nimble.surveytest.home.view.dialogs.DialogCreator.showToast(getActivity(), message);
    }
}
