package com.company.innerclasses2;

/**
 * 对于匿名类而言
 * 实例初始化的实际效果就额是构造器
 * 但是不能重载实例初始化方法
 *
 * 匿名内部类与正规的继承相比有些受限因为匿名内部类既可以扩展
 * 又可以实现接口，但是不能两者兼备
 * 而且如果是实现接口 也只能实现一个接口
 */
public class Parcel10 {
    public Destination
    destination(final String dest, final float price) {
        return new Destination() {
            private int cost;

            // Instance initialization for each object:
            {
                cost = Math.round(price);
                if (cost > 100)
                    System.out.println("Over budget!" + dest);
            }

            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Final xxx", 101.395F);
    }
} /* Output:
Over budget!
*///:~zyf95030915136656376
