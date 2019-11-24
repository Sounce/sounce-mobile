package com.sounce.sounce_mobile.customview;

import com.sounce.sounce_mobile.tflite.Classifier;

import java.util.List;


public interface ResultsView {
    public void setResults(final List<Classifier.Recognition> results);
}

