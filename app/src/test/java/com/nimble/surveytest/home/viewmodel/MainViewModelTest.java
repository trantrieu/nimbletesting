package com.nimble.surveytest.home.viewmodel;

import com.nimble.surveytest.home.model.datalayers.ImplementSurveyRepository;
import com.nimble.surveytest.home.model.entities.Survey;
import com.nimble.surveytest.home.view.activities.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Apple on 11/20/16.
 */

public class MainViewModelTest {

    static private Survey survey;

    @Mock
    private MainActivity mainActivity;

    @Mock
    private InfoViewModel infoViewModel;

    @Mock
    private MainViewModel mainViewModel;

    private MainViewModel.MainFragmentListener mainFragmentListener;

    @Mock
    private ImplementSurveyRepository surveyRepository;

    @Before
    public void setup(){
        mainActivity = mock(MainActivity.class);
        infoViewModel = mock(InfoViewModel.class);
        mainFragmentListener = mock(MainViewModel.MainFragmentListener.class);
        mainViewModel = new MainViewModel(mainActivity, infoViewModel, mainFragmentListener);
        surveyRepository = mock(ImplementSurveyRepository.class);

        survey = new Survey();
        survey.setTitle("title");
        survey.setDescription("description");
        survey.setCoverImageUrl("https://www.google.com.vn/images/branding/googlelogo/2x/googlelogo_light_color_272x92dp.png");
    }

    @Test
    public void testShowingMainView(){
        //        //verify show info view
        //        verify(mainViewModel).showInfoView();

        //verify show progress
        verify(infoViewModel, times(1)).showLoading();

        //        TestSubscriber<List<Survey>> testSubscriber = new TestSubscriber<>();
        //        Observable<List<Survey>> observable = surveyRepository.provideSurveyRepository();
        //        observable.subscribe(testSubscriber);
        //        testSubscriber.assertNoErrors();
        //        testSubscriber.assertReceivedOnNext(Arrays.asList(Arrays.asList(survey)));
    }

}
