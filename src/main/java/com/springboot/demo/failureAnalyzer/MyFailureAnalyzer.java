package com.springboot.demo.failureAnalyzer;

import com.springboot.demo.failureAnalyzer.exception.MyException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;
import org.springframework.stereotype.Component;

public class MyFailureAnalyzer implements FailureAnalyzer {
//    @Override
//    protected FailureAnalysis analyze(Throwable rootFailure, MyException cause) {
//        String des = "发生自定义异常";
//        String action = "由于自定义了一个异常";
//        return new FailureAnalysis(des, action, rootFailure);
//    }

    @Override
    public FailureAnalysis analyze(Throwable failure) {
        String des = "发生自定义异常";
        String action = "由于自定义了一个异常";
        return new FailureAnalysis(des, action, failure);
    }
}
