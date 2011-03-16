////John Rucker
//Homework 5 part1
//Due March 16, 2011
//This class creates a class which will be used to draw and
//keep track of a car instance. The car class will keep track
//of its position and speed.

package carsintroduction;
import processing.core.*;

public class Car {
   private int locationX, locationY, speed;
   private PApplet parent;

   public Car(PApplet papp, int x, int y, int carSpeed){
       locationX = x;  // Horizontal position on the X-axis
       locationY = y; //Vertical position on the Y-axis
       speed = carSpeed;  //Speed of the car
       parent = papp;
    }
   //Calculates the rate of speed at which the sqare moves
   public void moveRight(){
       if(locationX < parent.width){
           locationX += speed * 2;
       }
       else{
           locationX = 0;
       }
    }
   //Draws the car/square on the screen traveling at different speeds
   public void draw(){
      parent.fill(255,45,0);
      parent.background(0,0,6);
      parent.rect(locationX * 2, 25, 30, 10);
      parent.rect(locationX * 3, 50, 30, 10);
      parent.rect(locationX * 6, 100, 30, 10);
      parent.rect(locationX * 9, 150, 30, 10);
      parent.rect(locationX * 10, 200, 30, 10);
      parent.rect(locationX * 18, 250, 30, 10);
      parent.rect(locationX * 15, 300, 30, 10);
      parent.rect(locationX * 7, 350, 30, 10);
      parent.rect(locationX * 16, 400, 30, 10);
      parent.rect(locationX + 21, 450, 30, 10);
      
    }

}
