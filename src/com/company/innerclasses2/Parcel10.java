package com.company.innerclasses2;

/**
 * �������������
 * ʵ����ʼ����ʵ��Ч���Ͷ��ǹ�����
 * ���ǲ�������ʵ����ʼ������
 *
 * �����ڲ���������ļ̳������Щ������Ϊ�����ڲ���ȿ�����չ
 * �ֿ���ʵ�ֽӿڣ����ǲ������߼汸
 * ���������ʵ�ֽӿ� Ҳֻ��ʵ��һ���ӿ�
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
