package com.company;

public class TestCircleWithPrivateDataFields {

    public static void main(String[] args) {
	// create a circle with radius 5.0
        Circle myCircle = new Circle(5.0);

    }



    public class Circle {
        //The radius of the circle
        private double radius = 1;

        //The number of objects created
        private static int numberOfObjects = 0;

        //Constructor
        public Circle() {
            //numberOfObjects++;
        }

        //Construct a circle with a specified radius
        public Circle(double newRadius) {
            radius = newRadius;
            //numberOfObjects++;
        }

        //Return radius / getter function
        public double getRadius() {
            return radius;
        }

        //Set a new radius / setter function
        public void setRadius(double newRadius) {
            radius = (newRadius >= 0) ? newRadius : 0;
        }

        //return the area of this cirlce
        public double getArea() {
            return radius * radius * Math.PI;
        }

    }
}


