package BridgeLabz_Day37_Reflection;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "OLD_KEY";
}
public class AccessAndModifyStaticFields {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Configuration.class;
        Field field = cls.getDeclaredField("API_KEY");

        field.setAccessible(true);

        field.set(null, "NEW_SECRET_KEY");
        System.out.println("API_KEY : " + field.get(null));
    }
}
