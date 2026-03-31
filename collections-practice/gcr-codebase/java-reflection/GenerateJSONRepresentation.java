package BridgeLabz_Day37_Reflection;

import java.lang.reflect.Field;

class Students {
    private String name;
    private int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class GenerateJSONRepresentation {

    public static void main(String[] args) throws Exception {
        Students s = new Students("Naman", 21);
        System.out.println(toJson(s));
    }

    public static String toJson(Object obj) throws Exception {
        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        StringBuilder jsonSB = new StringBuilder();
        jsonSB.append("{");

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            jsonSB.append("\"").append(fields[i].getName()).append("\":");
            Object value = fields[i].get(obj);

            if (value instanceof String) {
                jsonSB.append("\"").append(value).append("\"");
            }
            else {
                jsonSB.append(value);
            }
            if (i < fields.length - 1) {
                jsonSB.append(",");
            }
        }
        jsonSB.append("}");
        return jsonSB.toString();
    }
}
