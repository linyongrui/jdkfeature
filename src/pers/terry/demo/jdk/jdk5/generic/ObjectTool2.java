package pers.terry.demo.jdk.jdk5.generic;

import pers.terry.demo.jdk.jdk5.introspector.User;

public class ObjectTool2 {
    //泛型是可以在方法上定义的
    public <T> T show(T t) {
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        //创建ObjectTool类的对象
        ObjectTool2 ot = new ObjectTool2();
        ot.show("hello");
        ot.show(true);
        ot.show(100);
        ot.show(new User());
    }
}
