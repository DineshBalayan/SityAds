package com.oxilo.shopsity.custom;
/*
 All Copyright, Audianz Network Pvt ltd.
CIN:
All intellectual property, code ownership belongs un-conditionally
to Audianz Network Pvt Ltd. No unauthorised code copying,
redistribution and editing is permitted.
Author: Audianz Network Pvt Ltd
CIN:
*/

import com.github.mikephil.charting.formatter.XAxisValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

/**
 * Created by Philipp Jahoda on 14/09/15.
 */
public class MyCustomXAxisValueFormatter implements XAxisValueFormatter {

    public MyCustomXAxisValueFormatter() {
        // maybe do something here or provide parameters in constructor
    }

    @Override
    public String getXValue(String original, int index, ViewPortHandler viewPortHandler) {

        //Log.i("TRANS", "x: " + viewPortHandler.getTransX() + ", y: " + viewPortHandler.getTransY());

        // e.g. adjust the x-axis values depending on scale / zoom level
        if (viewPortHandler.getScaleX() > 5)
            return "4";
        else if (viewPortHandler.getScaleX() > 3)
            return "3";
        else if (viewPortHandler.getScaleX() > 1)
            return "2";
        else
            return original;
    }
}
