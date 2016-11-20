package com.nimble.surveytest.home.model.datalayers;

import com.nimble.surveytest.home.model.entities.Survey;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by Apple on 11/20/16.
 */

public class ImplementSurveyRepository implements SurveyRepository {

    /**
     * Fake implement by calling a fetch empty data
     * @return
     */
    @Override
    public Observable<List<Survey>> provideSurveyRepository() {
        return Observable.create(new Observable.OnSubscribe<List<Survey>>() {
            @Override
            public void call(Subscriber<? super List<Survey>> subscriber) {
                subscriber.onNext(new ArrayList<Survey>());
                subscriber.onCompleted();
            }
        });
    }

    /**
     * Fake implement by calling a fetch empty data
     * @return
     */
    @Override
    public Observable<List<Survey>> provideSurveyRepository(int page, int perPage) {
        return Observable.create(new Observable.OnSubscribe<List<Survey>>() {
            @Override
            public void call(Subscriber<? super List<Survey>> subscriber) {
                subscriber.onNext(new ArrayList<Survey>());
                subscriber.onCompleted();
            }
        });
    }
}
