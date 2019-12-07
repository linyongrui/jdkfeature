package pers.terry.demo.jdk.jdk5.interfaceDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface Greeting {
    public enum FontColor {RED, GREEN, BLUE}

    String title();

    String content();

    FontColor fontColor() default FontColor.RED;
}
