//John Rucker
//Homework 5 part1
//Due March 16, 2011
//Creates a box for the cars to race in from left to right

package carsintroduction;
import processing.core.*;

public class Main extends PApplet {
    Car car; // Called from Car class
    @Override

    public void draw(){
        car.draw();
        car.moveRight();
    }

    public void setup(){
        size(800,500);  //Width and height of the area the car drives in
        smooth();  //Improves the quality of the shapes we will draw
        car = new Car(this, 0, 100, 3);        
    }

    public static void main(String[] args) {
        PApplet.main(new String[] { "--present", "carsintroduction.Main" } );
    }

}
