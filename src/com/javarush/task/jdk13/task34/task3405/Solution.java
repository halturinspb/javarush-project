package com.javarush.task.jdk13.task34.task3405;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Нарушение приватности
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User("Amigo", 21);
        print(getFields(user));

        Task task = new Task("task3405", true);
        print(getFields(task));
    }

    @SneakyThrows
    private static Object fieldGetObject(Field field, Object object) {
        return field.get(object);
    }

    public static Map<String, Object> getFields(Object object) throws Exception {
        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(field -> Modifier.isPrivate(field.getModifiers()))
                .peek(field -> field.setAccessible(true))
                .collect(Collectors.toMap(field -> field.getName(), field -> fieldGetObject(field, object)));

    }

    public static Map<String, Object> getFields1(Object object) throws Exception {
        Map<String, Object> map = new HashMap<>();
        Class<?> aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            int modifier = field.getModifiers();
            if (Modifier.isPrivate(modifier)) {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(object);
                map.put(name, value);
            }
        }


        return map;
    }

    public static void print(Map<?, ?> fields) {
        System.out.println("-------------------");
        fields.forEach((fieldName, fieldValue) -> System.out.println(fieldName + " = " + fieldValue));
    }
}
