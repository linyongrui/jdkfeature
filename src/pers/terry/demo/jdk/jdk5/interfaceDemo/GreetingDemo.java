package pers.terry.demo.jdk.jdk5.interfaceDemo;

public class GreetingDemo {
    @Greeting(title = "健康", content = "你最近身体好吗", fontColor = Greeting.FontColor.BLUE)
    public static void sayHello(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        sayHello("terry");
    }
}
