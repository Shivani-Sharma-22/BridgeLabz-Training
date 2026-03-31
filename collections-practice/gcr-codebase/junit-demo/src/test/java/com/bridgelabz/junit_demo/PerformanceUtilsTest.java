package com.bridgelabz.junit_demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

public class PerformanceUtilsTest {

    PerformanceUtils utils = new PerformanceUtils();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)   // max 2 seconds
    void testLongRunningTaskPerformance() throws InterruptedException {
        assertEquals("Done", utils.longRunningTask());
    }
}
