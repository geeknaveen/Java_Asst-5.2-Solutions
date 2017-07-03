/*Create three subclasses Circle, Rectangle and Triangle that extends Figure class and define both 
the methods. Write a program that will find the area and perimeter of 3 Figures and print the 
details for all.  */ 

package asst5_2;

public abstract class Figure     //Declaring abstract class Figure.     
{
	double dim1;       //Declaring the value of length parameter like diameter in circle, Side length in square and triangle.
	
	//METHODS
	public abstract void findArea();      //Abstract method to find area of different figures.
	
	public abstract void findPerimeter();     //Abstract method to find perimeter of figures.
	
}    //End of abstract class.