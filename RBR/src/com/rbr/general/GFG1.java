package com.rbr.general;

class GFG1
{
   public static void main (String[] args)
   {
      int x = 5, y = 10;
     // x = x ^ y ^ (y = x);
      x = x+y;
      y = x-y;
      x = x-y;
      System.out.println("After Swapping values of x and y are "
                          + x + " " + y);
   }
} 