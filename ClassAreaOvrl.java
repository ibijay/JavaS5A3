import java.lang.Math;

public class ClassAreaOvrl 
{
	ClassAreaOvrl(int h, int b)
	{
		System.out.println("Area of the Reactanle, with height "+ h + " and Base "+b +" is :" +(h*b));
	}
	ClassAreaOvrl(int b)
	{
		System.out.println("Area of the Square, with Base "+b +" is :" +(Math.pow(b, 2)));
	}
	
}
