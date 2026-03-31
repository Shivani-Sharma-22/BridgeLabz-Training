package BridgeLabz_Day37_Reflection;

import java.lang.reflect.*;

class Task {
    public void slowTask() throws InterruptedException {
        Thread.sleep(100);
    }
    public void fastTask() {
        for (int i = 0; i < 1000; i++) {}
    }
}

public class MethodExecutionTiming {
    public static void main(String[] args) throws Exception {
        Task tsk = new Task();
        Class<?> cls = tsk.getClass();
        Method mthd = cls.getMethod("slowTask");
        long startTime = System.nanoTime();
        mthd.invoke(tsk);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Method " + mthd.getName() +
                        " executed in " + duration / 1_000_000 + " ms");
    }
}
