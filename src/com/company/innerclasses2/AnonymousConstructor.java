package com.company.innerclasses2;

/**
 * 类似构造器行为
 * 匿名内部类中不可能有命名构造器
 * 通过实例初始话化
 * 能够达到为一个匿名内部类创建一个构造器的效果
 */
abstract class Base {
  public Base(int i) {
    System.out.println("Base constructor, i = " + i);
  }
  public abstract void f();
}	

public class AnonymousConstructor {
  public static Base getBase(int i) {
    return new Base(i) {
      //没有在这里使用i 所以不要求 i 必须声明为final类型
      { System.out.println("Inside instance initializer"); }
      public void f() {
        System.out.println("In anonymous f()");
      }
    };
  }
  public static void main(String[] args) {
    Base base = getBase(47);
    base.f();
  }
}