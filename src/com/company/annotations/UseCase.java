package com.company.annotations;//: annotations/UseCase.java
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
  public int id();
  public boolean sfky() default false;// 是否可用
  public String description() default "no description";
} ///:~
