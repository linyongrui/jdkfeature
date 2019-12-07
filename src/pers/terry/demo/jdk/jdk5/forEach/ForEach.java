package pers.terry.demo.jdk.jdk5.forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

    public static void main(String[] args) {
        //遍历集合
        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        for (String s : list) {
            System.out.println(s);
        }

        //遍历map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(3, "zhagsan");
        map.put(1, "wangyi");
        map.put(7, "wagnwu");
        map.put(4, "zhagsansan");

        //直接对mapforEach
        for (Map.Entry<Integer, String> me : map.entrySet()) {
            Integer key = me.getKey();
            String value = me.getValue();
            System.out.println(key + ":" + value);
        }

        //对key forEach，再取value
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
