package Annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Service {
    @LogExecutionTime
    void work() {
        for(int i = 0; i < 1000000; i++);
    }
}
public class LoggingExecution{
    public static void main(String[] args) throws Exception {
        Service s = new Service();
        Method mthd = Service.class.getDeclaredMethod("work");
        long start = System.nanoTime();
        s.work();
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}