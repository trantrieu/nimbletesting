package com.nimble.surveytest.utils;

import com.squareup.otto.Bus;

/**
 * Created by Apple on 11/19/16.
 */

public class EventBusManager {

    static private Bus bus = new Bus();
    static public Bus getOttoManager(){
        return bus;
    }
}
