package pers.terry.demo.jdk.jdk5.generic;

import java.util.ArrayList;
import java.util.Collection;

public class WildcardGeneric {
    class Animal{
    }
    class Cat extends Animal {
    }
    class Dog extends Animal{
    }

    public static void main(String[] args) {
        //创建集合对象,泛型如果明确的情况下,前后必须保持一致
        Collection<Object> c1 = new ArrayList<Object>() ;
//		Collection<Object> c2 = new ArrayList<Cat>() ;//错误
//		Collection<Object> c3 = new ArrayList<Animal>() ;//错误

        //<?>  :代表任意类型Object类型,或者任意的Java类
        Collection<?> c4 = new ArrayList<Object>() ;
        Collection<?> c5 = new ArrayList<Animal>() ;
        Collection<?> c6 = new ArrayList<Dog>() ;
        Collection<?> c7= new ArrayList<Cat>() ;

//		<? extends E>:向下限定,E的子类或者E这个类型
        Collection<? extends Object> c8 = new ArrayList<Object>() ;
        Collection<? extends Object> c9 = new ArrayList<Animal>() ;
        Collection<? extends Object> c10 = new ArrayList<Cat>() ;
//		Collection<? extends Aninal> c11 = new ArrayList<Object>() ;//错误

//		<? super E>:向上限定,E及其他的父类
//		Collection<? super Animal> c12 = new ArrayList<Cat>() ;//错误
        Collection<? super Animal> c13 = new ArrayList<Animal>() ;
        Collection<? super Animal> c14 = new ArrayList<Object>() ;
    }
}
