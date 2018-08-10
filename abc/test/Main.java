package com.abc.test;

import java.io.*;

public class Main {

public static void main(String[] args) throws IOException {
   // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    //System.out.println("enter name");
    //String s = in.readLine();
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  
	System.out.println("Enter your name");  
	String name=br.readLine();  
	System.out.println("Welcome "+name); 

    //while ((s = in.readLine()) != null) {
      //System.out.println(s);
    //}
    
   // String[] str = name.split(" ");
    
    /*int a,b,c,d,e,f,g,h;
    a = Integer.parseInt(str[0]);
    b = Integer.parseInt(str[1]);
    c = Integer.parseInt(str[2]);
    d = Integer.parseInt(str[3]);
    e = Integer.parseInt(str[4]);
    f = Integer.parseInt(str[5]);
    g = Integer.parseInt(str[6]);
    h = Integer.parseInt(str[7]);
    
    Point l1 = new Point(a,b);
    Point r1 = new Point(c,d);
    Point l2 = new Point(e,f);
    Point r2 = new Point(g,h);
    
    boolean overlap = doRectangleOverlap(l1,r1,l2,r2);
    System.out.println(overlap);
  }
  
  static class Point {
      int x,y;
      public Point(int x, int y) {
          this.x = x;
          this.y = y;
      }
  }
  
  public static boolean doRectangleOverlap(Point l1, Point r1, Point l2, Point r2) {
      if(l1.x>r2.x || l2.x>r1.x) {
          return false;
      }
    if(l1.y<r2.y || l2.y<r1.y) {
        return false;
    }
    return true;
  }*/
}
}
