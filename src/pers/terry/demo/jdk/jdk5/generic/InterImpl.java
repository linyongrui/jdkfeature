package pers.terry.demo.jdk.jdk5.generic;

public class InterImpl implements Inter<String> {
    public static void main(String[] args) {
        Inter<String> i = new InterImpl();
        i.show("i");
    }

    @Override
    public void show(String t) {
        System.out.println("show:" + t);
    }
}
