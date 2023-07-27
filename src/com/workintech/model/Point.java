package com.workintech.model;

public class Point {

    //instance variables
    private int x;
    private int y;

    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //distance methods

    public double distance(int a, int b) {
        int xDiff = this.x - a;
        int yDiff = this.y - b;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(Point p) {
        if (p != null) {
            int xDiff = this.x - p.getX();
            int yDiff = this.y - p.getY();
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        } else {
            return distance();
        }
    }
}
