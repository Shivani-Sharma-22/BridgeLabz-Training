package Annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class BugTracker {

    @BugReport(description = "Null Pointer Issue")
    @BugReport(description = "UI Bug")
    void fixBug() { }

}
public class CreateAndUserRepeatable{
    public static void main(String[] args) throws Exception {

        Method m = BugTracker.class.getDeclaredMethod("fixBug");
        BugReport[] bugs = m.getAnnotationsByType(BugReport.class);
        for (BugReport b : bugs) {
            System.out.println(b.description());
        }
    }

}