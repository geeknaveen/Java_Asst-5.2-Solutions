/*Display the area and perimeter of 3 Figures (Circle, Rectangle and Triangle) and print the details 
for all.  */

package asst5_2;

import java.util.*;       //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

	/*
	 * This assignment helped me to master the concepts of inheritence, abstract class and abstract methods.
	 */

	public class Calculate_Area_Perimeter      //Declaration of class containing main function. 
	{
		public static void main(String[] args)    //main function declaration. and because it is static, program execution starts from main function.
		{
			double circleDiameter;      //double variable to store diameter of circle.
			double rectangleSide1,rectangleSide2;     //double variables to store sides of rectangle.
			double triangleSide;        //double variable to store the size of triangle.
			
			//Now we want to take input of the values of length parameters from the user.
	      	// For taking input from the user, we have to make the object of Scanner class.
	      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
			Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
			
			/*(1) Circle*/
			System.out.println("\n******Calculating Area & Perimeter of Cirlce********");
			System.out.println("Please Enter the radius of circle: ");     //Asking for input.
			circleDiameter=sc.nextDouble();      //Initializing diameter of circle.
			Circle circleDemo=new Circle(circleDiameter);
			circleDemo.findArea();       //Calling the function to find area.
			circleDemo.findPerimeter();       //Calling the function to perimeter.
			System.out.println();
			
			
			/*(2) Rectangle*/
			System.out.println("\n******Calculating Area & Perimeter of Rectangle********");
			System.out.println("Enter length of rectangle: ");     //Asking for input.
			rectangleSide1=sc.nextDouble();      //Initializing first side of rectangle.
			System.out.println("Enter breadth of rectangle: ");
			rectangleSide2=sc.nextDouble();      //Initializing second side of rectangle.
			Rectangle rectangleDemo=new Rectangle(rectangleSide1,rectangleSide2);
			rectangleDemo.findArea();       //Calling the function to find area.
			rectangleDemo.findPerimeter();       //Calling the function to perimeter.
			System.out.println();
			
			
			/*(3) Triangle*/
			System.out.println("\n******Calculating Area & Perimeter of Triangle********");
			System.out.println("Enter length of first side of triangle : ");     //Asking for input.
			triangleSide=sc.nextDouble();      //Initializing side of triangle.
			System.out.println("Enter length of second side of triangle : ");     //Asking for input.
			triangleSide=sc.nextDouble();      //Initializing side of triangle.
			System.out.println("Enter length of third side of triangle : ");     //Asking for input.
			triangleSide=sc.nextDouble();      //Initializing side of triangle.
			Triangle triangleDemo=new Triangle(triangleSide);
			triangleDemo.findArea();       //Calling the function to find area.
			triangleDemo.findPerimeter();       //Calling the function to perimeter.
			System.out.println();
			
			sc.close();         //Closing the object of Scanner class.
			
		}    //End of main function.
	}    