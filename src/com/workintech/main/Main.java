package com.workintech.main;

import com.workintech.model.Player;
import com.workintech.model.Point;
import com.workintech.model.Weapon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());


        System.out.println("*******************************");
        Player player = new Player("Burcu", 1000, Weapon.SWORD);
        System.out.println(player);
        player.loseHealth(500);
        System.out.println(player);
        player.restoreHealth(1200);
        System.out.println(player);


        //pass by reference pass by value
        Player player2 = new Player("Koray", 80, Weapon.MACE);
        player = player2;
        System.out.println("pass by reference" + player);

    }
}