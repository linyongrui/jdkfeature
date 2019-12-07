package pers.terry.demo.jdk.jdk5.generic;

public class ObjectTool<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        //创建ObjectTool对象
        ObjectTool<String> ot = new ObjectTool<>() ;

        //赋值
        ot.setObj("高圆圆");
        String s = ot.getObj() ;
        System.out.println("ot:"+s);


        ObjectTool<Integer> ot2 = new ObjectTool<>() ;
        ot2.setObj(Integer.valueOf(12));
        System.out.println("ot2:"+ot2.getObj());
    }
}
