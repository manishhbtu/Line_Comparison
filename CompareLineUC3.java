package com.company;
import java.util.Scanner;

public class CompareLineUC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        double x1,x2,y1,y2, distance1;
	        double x3,x4,y3,y4, distance2;
	        Scanner sc= new Scanner (System.in);
	        System.out.println("Enter the value for x1: ");
	        x1= sc.nextDouble();
	        System.out.println("Enter the value for y1: ");
	        y1=sc.nextDouble();
	        System.out.println("Enter the value for x2: ");
	        x2=sc.nextDouble();
	        System.out.println("Enter the value for y2: ");
	        y2=sc.nextDouble();
	        System.out.println("Enter the value for x3: ");
	        x3= sc.nextDouble();
	        System.out.println("Enter the value for y3: ");
	        y3=sc.nextDouble();
	        System.out.println("Enter the value for x4: ");
	        x4=sc.nextDouble();
	        System.out.println("Enter the value for y4: ");
	        y4=sc.nextDouble();

	        distance1=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
	        System.out.println("the distance between ("+x1 +" ," + y1 +") and (" +x2 + " ," +y2 +" ) is " +distance1 + ".");
	        distance2=Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
	        System.out.println("the distance between ("+x3 +" ," + y3 +") and (" +x4 + " ," +y4 +" ) is " +distance2+ ".");

	        if (distance1==distance2){
	            System.out.println("Both line are equal");
	        } else if (distance1 > distance2) {

	            System.out.println("line one is large than line two");
	        }else if(distance2>distance1){
	                System.out.println("line two is large than line one");
	        }else{
	            System.out.println("lines are not equal");
	        }

	}

}
