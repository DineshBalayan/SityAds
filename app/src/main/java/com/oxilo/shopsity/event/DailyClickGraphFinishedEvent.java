package com.oxilo.shopsity.event;
/*
 All Copyright, Audianz Network Pvt ltd.
CIN:
All intellectual property, code ownership belongs un-conditionally
to Audianz Network Pvt Ltd. No unauthorised code copying,
redistribution and editing is permitted.
Author: Audianz Network Pvt Ltd
CIN:
*/

import com.github.mikephil.charting.data.BarDataSet;

import java.util.ArrayList;

import lecho.lib.hellocharts.model.LineChartData;

/**
 * Created by ericbasendra on 28/11/15.
 */
public class DailyClickGraphFinishedEvent {

    private LineChartData data;

    ArrayList<BarDataSet> dataSets;
    ArrayList<String> xAxis;

    public DailyClickGraphFinishedEvent(){

    }
    public DailyClickGraphFinishedEvent(LineChartData data){
        this.data = data;
    }

    public DailyClickGraphFinishedEvent(ArrayList<BarDataSet> dataSets, ArrayList<String> xAxis){
        this.dataSets =dataSets;
        this.xAxis = xAxis;
    }

    public LineChartData getData() {
        return data;
    }

    public void setData(LineChartData data) {
        this.data = data;
    }

    public ArrayList<BarDataSet> getDataSets() {
        return dataSets;
    }

    public void setDataSets(ArrayList<BarDataSet> dataSets) {
        this.dataSets = dataSets;
    }

    public ArrayList<String> getxAxis() {
        return xAxis;
    }

    public void setxAxis(ArrayList<String> xAxis) {
        this.xAxis = xAxis;
    }

}
