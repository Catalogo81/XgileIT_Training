//Question 1

package com.packages;

public class Room
{
     double height = 12.5;
     double width = 15.5;
     double breath = 4.5;

     public Room(double height, double width,  double breath)
     {
         this.height = height;
         this.width = width;
         this.breath = breath;
     }

     public double volume()
     {
        double v = height * width * breath;
        //System.out.print(v);

        return v;
     }

//     public static void main(String[] args)
//     {
//         Room r1 = new Room();
//
//         double volume = r1.volume();
//         System.out.println(volume);
//     }
}
