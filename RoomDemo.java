//Question 1

package com.packages;

public class RoomDemo
{

    public static void main(String[] args)
    {
        Room room1 = new Room(12, 22, 15);
        Room room2 = new Room(4,5,6);
        Room room3 = new Room(2.1,5.6,5);

        double r1 = room1.volume();
        System.out.println("Room 1's volume: " + r1);
        double r2 = room2.volume();
        System.out.println("Room 2's volume: " + r2);
        double r3 = room3.volume();
        System.out.println("Room 3's volume: " + r3);
    }
}
