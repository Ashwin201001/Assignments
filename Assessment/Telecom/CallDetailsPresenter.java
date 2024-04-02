package com.exam;

public class CallDetailsPresenter {

    public static void displayCallDetails() {
        
        CallRecordFetcher callRecordFetcher = new CallRecordFetcher();
        System.out.println("Displaying Call Details...");
        callRecordFetcher.fetchCallRecords();
    }
}