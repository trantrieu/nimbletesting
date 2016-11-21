package com.nimble.surveytest.home.view.activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.nimble.surveytest.home.view.fragments.BaseFragment;

/**
 * Created by Trieu on 7/28/2016.
 */
public class BaseActivity extends AppCompatActivity {

    public void addFragment(int containerViewId, BaseFragment fragment) {
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(containerViewId, fragment, fragment.getTagName());
        fragmentTransaction.addToBackStack("add " + fragment.getTagName());
        fragmentTransaction.commit();
    }

    public void replaceFragment(int containerViewId, BaseFragment fragment) {
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(containerViewId, fragment, fragment.getTagName());
        fragmentTransaction.addToBackStack("replace " + fragment.getTagName());
        fragmentTransaction.commit();
    }

    public void removeThisFragment(BaseFragment fragment){
        getSupportFragmentManager().popBackStack();
    }

    public void backToFragment(String name){
        getSupportFragmentManager().popBackStack("replace "+name, 0);
    }

    public void backToFragmentInclusive(String name){
        getSupportFragmentManager().popBackStack("replace "+name, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    protected void clearAllBackStack() {
        for(int i = 0; i < getSupportFragmentManager().getBackStackEntryCount(); ++i) {
            getSupportFragmentManager().popBackStack();
        }
    }

    public void popBackStack(){
        getSupportFragmentManager().popBackStackImmediate();
    }

    //http://stackoverflow.com/questions/18755550/fragment-pressing-back-button
    @Override
    public void onBackPressed() {
        if(getSupportFragmentManager().getBackStackEntryCount() == 1 || getSupportFragmentManager().getBackStackEntryCount() == 0
                ){
            //need to check again
            clearAllBackStack();
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //need to check again
        clearAllBackStack();
    }
}
