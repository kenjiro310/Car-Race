////John Rucker
//Homework 5 part2
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
       speed = carSpeed;  //Speed of the cars
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
      //Loop to create cars and increment speed of the cars
      for(int i = 1; i < 12; i++ ){
        parent.rect(locationX * i, locationY * i * 25, 30, 10);
       }
      
   }

}
