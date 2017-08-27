
public class Point {

	private int xpt;
	private int ypt;
	
	//creates a point with point x, y
	public Point (int x, int y)
	{
		xpt = x;
		ypt = y;
	}
	
	//creates a 0, 0 point
	public Point()
	{
		xpt = 0;
		ypt = 0;
	}
	
	//returns the x value of the point
	public int getX()
	{
		return xpt;
	}
	
	//returns the y value of the point
	public int getY()
	{
		return ypt;
	}
	
	public String toString()
	{
		return "( " + xpt + ", " + ypt + " )";
	}
	
}
