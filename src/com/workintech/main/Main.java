package com.workintech.main;

import com.workintech.model.Player;
import com.workintech.model.Point;
import com.workintech.model.Weapon;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Point-----");

        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        Point third = new Point(-2, -4);

        System.out.println(first.distance(third));

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("Player-----");

        Player player = new Player("Can", 100, Weapon.SWORD);

        System.out.println(player);

        player.loseHealth(70);

        System.out.println(player);

        player.restoreHealth(800);

        System.out.println(player);

    }
}