package com.company;
import java.util.Scanner;
public class GeometryLenthUC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,x2,y1,y2, distance;
	      Scanner sc= new Scanner (System.in);
	        System.out.println("Enter the value for x1: ");
	        x1= sc.nextDouble();
	        System.out.println("Enter the value for y1: ");
	        y1=sc.nextDouble();
	        System.out.println("Enter the value for x2: ");
	        x2=sc.nextDouble();
	        System.out.println("Enter the value for y2: ");
	        y2=sc.nextDouble();

	        distance=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
	        System.out.println("the distance between ("+x1 +" ," + y1 +") and (" +x2 + " ," +y2 +" ) is " +distance + ".");
	}

}
