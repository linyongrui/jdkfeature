package pers.terry.demo.jdk.jdk5.introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Arrays;

public class IntrospectorDemo {
    public static void main(String[] args) throws Exception {
        final User user = new User();
        user.setName("nana");
        user.setAddress("hangzhou");

        //如果不想把父类的属性也列出来的话，那getBeanInfo的第二个参数填写父类的信息
        BeanInfo beanInfo = Introspector.getBeanInfo(user.getClass(), Object.class);
        PropertyDescriptor[] descriptor = beanInfo.getPropertyDescriptors();
        Arrays.stream(descriptor).forEach(x -> {
            try {
                System.out.println(x.getName() + " before: " + x.getReadMethod().invoke(user));
                x.getWriteMethod().invoke(user, "suzhou");
                System.out.println(x.getName() + " after: " + x.getReadMethod().invoke(user));
            } catch (ReflectiveOperationException e) {
                e.getLocalizedMessage();
            }
        });
    }
}
