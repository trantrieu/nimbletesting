package com.nimble.surveytest.home.model.datalayers;

import com.nimble.surveytest.home.model.entities.Survey;
import com.nimble.surveytest.utils.Constant;

import java.util.List;

import rx.Observable;

/**
 * Created by Apple on 11/20/16.
 */

public class ImplementSurveyRepository implements SurveyRepository {

    @Override
    public Observable<List<Survey>> provideSurveyRepository() {
        return SurveyService.Factory.getInstance().listSurvey(Constant.TOKEN);
    }

    @Override
    public Observable<List<Survey>> provideSurveyRepository(int page, int perPage) {
        return SurveyService.Factory.getInstance().listSurveyByPage(Constant.TOKEN, page, perPage);
    }
}
