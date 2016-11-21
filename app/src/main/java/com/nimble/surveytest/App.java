package com.nimble.surveytest;

import android.app.Application;
import android.view.LayoutInflater;

import com.nimble.surveytest.home.model.datalayers.SurveyService;

/**
 * Created by Apple on 11/19/16.
 */

public class App extends Application {

    static public LayoutInflater inflater;
    //static private RefWatcher refWatcher;
    @Override
    public void onCreate() {
        super.onCreate();
        inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        //        if (LeakCanary.isInAnalyzerProcess(this)) {
        //            return;
        //        }
        //        refWatcher = LeakCanary.install(this);
    }

    //    static public RefWatcher getRefWatcher(){
    //        return refWatcher;
    //    }

    @Override
    public void onTerminate() {
        //        refWatcher = null;
        inflater = null;
        SurveyService.Factory.stopSurveyService();
        super.onTerminate();
    }
}
