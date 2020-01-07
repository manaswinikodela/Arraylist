package com.io.collections;
import java.util.*;
public class ArrList {

   public static void main(String args[]) {
	   ArrayList<String> obj = new ArrayList<String>(
		Arrays.asList("manu", "teja", "rohit","kiran","pranay"));
	  System.out.println("Elements are:"+obj);
  obj.add("hello");
  obj.add(5,"someone");
  System.out.println("Elements are:"+obj);
  obj.set(5,"anyone");
  obj.remove(6);
  System.out.println("actual output is"+obj);
  
   }
}