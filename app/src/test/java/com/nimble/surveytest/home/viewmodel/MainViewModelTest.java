package com.nimble.surveytest.home.viewmodel;

import com.nimble.surveytest.home.view.activities.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

/**
 * Created by Apple on 11/20/16.
 */

public class MainViewModelTest {

    @Mock
    private MainActivity mainActivity;

    @Mock
    private InfoViewModel infoViewModel;

    @Mock
    private MainViewModel mainViewModel;

    private MainViewModel.MainFragmentListener mainFragmentListener;

    @Before
    public void setup(){
        mainActivity = mock(MainActivity.class);
        infoViewModel = mock(InfoViewModel.class);
        mainFragmentListener = mock(MainViewModel.MainFragmentListener.class);
        mainViewModel = new MainViewModel(mainActivity, infoViewModel, mainFragmentListener);
    }

    @Test
    public void testShowingMainView(){
//        //verify show info view
//        verify(mainViewModel).showInfoView();
//        //verify show progress
//        verify(infoViewModel, times(1)).showLoading();
    }

}
