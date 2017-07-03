/*Create three subclasses Circle, Rectangle and Triangle that extends Figure class and define both 
the methods. Write a program that will find the area and perimeter of 3 Figures and print the 
details for all.   
*/
package asst5_2;

public class Circle extends Figure     //Declaring the class which inherited by Figure class. 
{
	double areaCircle;      //double variable to store the value of area of circle.
	double perimeterCircle;     //double variable to store the value of perimeter of circle.
	double piValue=3.141;     //Value of pi.
	
	public Circle(double dim1)     //Constructor.
	{
		super.dim1=dim1;          //Initializing the diameter of circle.
	}
	
	public void findArea()
	{
		areaCircle=(piValue*dim1*dim1)/4;           //Finding the area of circle.
		
		System.out.println("Area of circle is: "+areaCircle);     //Printing the area of circle.
	}
	
	public void findPerimeter()
	{
		perimeterCircle = piValue * dim1 ;       //Finding the perimeter of the circle.
		
		System.out.println("Perimeter of circle: "+perimeterCircle);       //Printing the perimeter value of circle.
	}
	
}    //End of Circle class.