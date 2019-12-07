package pers.terry.demo.jdk.jdk5.generic;

public interface Inter<T> {
    //接口中变量是常量: public static final  int num ;
    public abstract void show(T t) ; //抽象方法
}