package com.io.collections;
import java.lang.reflect.Array;
import java.util.*;
public class Iterate2 {

   public static void main(String[] args) {

      ArrayList<Integer> arrlist = new ArrayList<Integer>(  ){{
    	add(1);
    	add(56);  
      }};
      System.out.println("While Loop"); 		
      int count = 0; 		
      while (arrlist.size() > count) {
	 System.out.println(arrlist.get(count));
         count++;
      }
}

	
}
