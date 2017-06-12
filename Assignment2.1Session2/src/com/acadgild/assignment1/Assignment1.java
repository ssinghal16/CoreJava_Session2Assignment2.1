//Write a program to find the highest among the given 3 numbers. 

package com.acadgild.assignment1;
//Importing Scanner class
import java.util.Scanner;

//Class declaration
public class Assignment1 {

	//Main Method
	public static void main(String[] args) {
		int x, y, z;
	      System.out.println("Enter three integers numbers: ");
	      
	      Scanner in = new Scanner(System.in);
	      // Input from user 
	      x = in.nextInt();
	      y = in.nextInt();
	      z = in.nextInt();
	 //Conditions to check highest value 
	      if ( x > y && x > z )
	         System.out.println("First number is largest: "+x);
	      else if ( y > x && y > z )
	         System.out.println("Second number is largest: "+y);
	      else if ( z > x && z > y )
	         System.out.println("Third number is largest: "+z);
	      else   
	         System.out.println("Entered numbers are not distinct.");
	}

}

