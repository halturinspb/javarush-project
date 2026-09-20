package com.javarush.task.jdk13.task34.task3409;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Generator<T> {

    private Class<T> aClass;

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    T newInstance() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<T> declaredConstructor = (Constructor<T>) aClass.getDeclaredConstructors()[0];
        int parameterCount = declaredConstructor.getParameterCount();
        Object[] objects = new Object[parameterCount];

        return declaredConstructor.newInstance(objects);

    }
}
