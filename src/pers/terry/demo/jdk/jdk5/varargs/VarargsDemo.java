package pers.terry.demo.jdk.jdk5.varargs;

public class VarargsDemo {
    public static int sum(int... a) {
        System.out.println("a:" + a); //a是一个数组
        int s = 0;
        for (int x : a) {
            s += x;
        }
        return s;
    }

    public static void main(String[] args) { // 2个数据求和
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 30;
        int result = sum(a, b);
        System.out.println("result:" + result);
        result = sum(a, b, c);
        System.out.println("result:" + result);
        result = sum(a, b, c, d);
        System.out.println("result:" + result);
        result = sum(a, b, c, d, 40);
        System.out.println("result:" + result);
        result = sum(a, b, c, d, 40, 50);
        System.out.println("result:" + result);
    }
}
