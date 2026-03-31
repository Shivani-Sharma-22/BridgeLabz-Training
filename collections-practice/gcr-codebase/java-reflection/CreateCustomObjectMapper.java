package BridgeLabz_Day37_Reflection;

import java.lang.reflect.Field;
import java.util.*;

class Studentt {
    private String name;
    private int age;
    public void display() {
        System.out.println(name + " " + age);
    }
}
public class CreateCustomObjectMapper {
    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Bhavy");
        map.put("age", 21);
        Studentt s = toObject(Studentt.class, map);
        s.display();
    }
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (String key : properties.keySet()) {
            Field field = clazz.getDeclaredField(key);
            field.setAccessible(true);
            field.set(obj, properties.get(key));
        }
        return obj;
    }
}
