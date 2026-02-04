package com.bridgelabz.junit_demo;

public class PerformanceUtils {

    /**
     * Simulates a long-running task
     * @return "Done" after sleeping
     * @throws InterruptedException if the thread is interrupted
     */
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(1000); // simulate 1 second task
        return "Done";
    }
}
