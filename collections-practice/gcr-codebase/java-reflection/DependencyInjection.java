package BridgeLabz_Day37_Reflection;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
}

class Service {
    public void serve() {
        System.out.println("Service called");
    }
}

class Controller {
    @Inject
    private Service service;
    public void process() {
        service.serve();
    }
}

class DIContainer {
    public static <T> T createObject(Class<T> clazz) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Object dependency = field.getType().getDeclaredConstructor().newInstance();
                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }
        return obj;
    }
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        Controller ct = DIContainer.createObject(Controller.class);
        ct.process();
    }
}
