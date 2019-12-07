package pers.terry.demo.jdk.jdk5.generic;

public class InterImpl2<T> implements Inter<T> {
    public static void main(String[] args) {
        Inter<String> i = new InterImpl2();
        i.show("String");
        Inter<Integer> i2 = new InterImpl2();
        i2.show(2);
    }

    @Override
    public void show(T t) {
        System.out.println("show:" + t);
    }
}
