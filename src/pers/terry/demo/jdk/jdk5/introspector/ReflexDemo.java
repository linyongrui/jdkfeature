package pers.terry.demo.jdk.jdk5.introspector;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflexDemo {
    public static void testField(Class<?> clazz) {
//getFields()：获得某个类的所有的公共（public）的字段，包括父类中的字段。
//getDeclaredFields()：获得某个类的所有声明的字段，即包括public、private和proteced，但是不包括父类的申明字段。
//      Field[] fields = clazz.getFields();
        Field[] fields = clazz.getDeclaredFields();
        if (fields != null) {
            for (Field field : fields) {
                System.out.println(field.getModifiers() + " " + field.getType() + " " + field.getName());
            }
        }
    }

    public static void testConstructor(Class<?> clazz) {
//		Constructor<?>[] constructors = clazz.getConstructors();
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        if (constructors != null) {
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.getName() + "**" + constructor.getParameterTypes());
            }
        }
    }

    public static void testMethod(Class<?> clazz) {
//		Method[] methods = clazz.getMethods();
        Method[] methods = clazz.getDeclaredMethods();
        if (methods != null) {
            for (Method method : methods) {
                String methodName = method.getName();
                Class<?>[] paramTypes = method.getParameterTypes();
                System.out.println("methodName=" + methodName + "**params=" + Arrays.toString(paramTypes));

                if ("say".equals(methodName)) {    //say 方法是 private类型的
                    try {
                        method.setAccessible(true);    //暴力破解
                        Object result = method.invoke(clazz.getDeclaredConstructor().newInstance(), new Object[]{"haha"});
                        System.out.println(methodName + " invoke result=" + result);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        testField(User.class);
        testConstructor(User.class);
        testMethod(User.class);
    }
}
