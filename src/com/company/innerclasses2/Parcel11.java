package com.company.innerclasses2;//: innerclasses2/Parcel11.java

/**
 * �ڲ�������Ϊstatic
 * Ƕ����
 * 1)Ҫ����Ƕ����Ķ��󣬲���Ҫ����Χ��Ķ���
 * 2)���ܴ�Ƕ����Ķ����з��ʷǾ�̬����Χ�����
 */
public class Parcel11 {
    //Ƕ����
    private static class ParcelContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination
            implements Destination {
        private String label;

        private ParcelDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }

        // Nested classes can contain other static elements:
        public static void f() {
        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {
            }

            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }
} ///:~
