package pers.terry.demo.jdk.jdk5.enumDemo;

public class EnumDemo {
    // 无带参构造aaaabbb
    public enum TrafficLamp {
        RED, GREEN, YELLW;
    }

    // 提供带参构造jhgjg
    public enum TrafficLamp2 {
        RED(30), GREEN(40), YELLW(5);
        private int time;

        private TrafficLamp2(int time) {
            this.time = time;
        }

        public int getTime() {
            return time;
        }
    }

    // 提供带参构造，并有抽象方法
    public enum TrafficLamp3 {
        RED(30) {
            @Override
            public TrafficLamp3 nextLamp() {
                return TrafficLamp3.GREEN;
            }
        },
        GREEN(40) {
            @Override
            public TrafficLamp3 nextLamp() {
                return TrafficLamp3.YELLW;
            }
        },
        YELLW(5) {
            @Override
            public TrafficLamp3 nextLamp() {
                return TrafficLamp3.RED;
            }
        };
        private int time;

        private TrafficLamp3(int time) {
            this.time = time;
        }

        public int getTime() {
            return time;
        }

        // 提供一个抽象方法，用于获取下个灯
        public abstract TrafficLamp3 nextLamp();
    }

    public static void main(String[] args) {
        System.out.println(TrafficLamp.GREEN);
        System.out.println(TrafficLamp2.GREEN);
        System.out.println(TrafficLamp2.GREEN.getTime());
        System.out.println(TrafficLamp3.GREEN);
        System.out.println(TrafficLamp3.GREEN.nextLamp());
    }
}
