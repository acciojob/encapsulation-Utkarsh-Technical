package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly rw = new RWOnly();
      // rw.name="Utkarsh";
      // 'name' has private access in 'com.driver.RWOnly'
      String name= "AccioJob";
      rw.setter(name);
      String str = rw.getter();
      System.out.println(str);
  }
}