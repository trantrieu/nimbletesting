package com.nimble.surveytest.home.model.datalayers;

import com.nimble.surveytest.home.model.entities.Survey;
import com.nimble.surveytest.utils.Constant;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Apple on 11/19/16.
 */

public interface SurveyService {

    @GET("app/surveys.json")
    Observable<List<Survey>> listSurveyByPage(@Query("access_token") String accessToken, @Query("page") int page, @Query("per_page") int perPage);

    @GET("app/surveys.json")
    Observable<List<Survey>> listSurvey(@Query("access_token") String accessToken);

    class Factory {
        static private SurveyService instance;
        static private SurveyService create() {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
            return retrofit.create(SurveyService.class);
        }

        static public SurveyService getInstance(){
            if(instance == null){
                instance = create();
            }
            return instance;
        }

        static public void stopSurveyService(){
            instance = null;
        }
    }

}
