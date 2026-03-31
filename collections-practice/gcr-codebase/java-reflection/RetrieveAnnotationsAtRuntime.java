package BridgeLabz_Day37_Reflection;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}
@Author(name = "Kanhiya Sharma")
class DemoClass {
}

public class RetrieveAnnotationsAtRuntime {
    public static void main(String[] args) {
        Class<?> cls = DemoClass.class;
        Author author = cls.getAnnotation(Author.class);
        System.out.println("Author Name : " + author.name());
    }
}
