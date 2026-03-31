
package Annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class Userr {
    @JsonField(name = "user_name")
    String name = "Shivani";

}
public class CustomSerialization{
    public static void main(String[] args) throws Exception {
        Userr u = new Userr();
        for(Field f : u.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(JsonField.class)) {
                System.out.println("{\"" + f.getAnnotation(JsonField.class).name() +
                        "\":\"" + f.get(u) + "\"}");
            }
        }
    }
}
