package com.sounce.mobile.customview;

import com.sounce.mobile.tflite.Classifier;

import java.util.List;

public interface ResultsView {
    public void setResults(final List<Classifier.Recognition> results);
}
