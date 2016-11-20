package com.nimble.surveytest.home.model.datalayers;

import com.nimble.surveytest.home.model.entities.Survey;

import java.util.List;

import rx.Observable;

/**
 * Created by Apple on 11/20/16.
 */

public interface SurveyRepository {

    Observable<List<Survey>> provideSurveyRepository();
    Observable<List<Survey>> provideSurveyRepository(int page, int perPage);
}
