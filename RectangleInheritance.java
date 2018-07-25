import java.util.*;
class Rectangle 
{ 
	int length;
	int breadth;
	Rectangle(){};
	Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
}
class RectangleHeight extends Rectangle
{
	int height;
	RectangleHeight(){}
	RectangleHeight(int h)
	{ 
		height=h;
	}
	void volume()
	{
		int v;
		v=length*breadth*height;
		System.out.println("volume="+v);
	}
}
public class RectangleInheritance
{
	public static void main(String args[])
	{
		System.out.println("enter length,breadth and height");
		RectangleHeight R=new RectangleHeight();
		Scanner x=new Scanner(System.in);
		R.length=x.nextInt();
		R.breadth=x.nextInt();
		R.height=x.nextInt();
		R.volume();
	}
}
				
		
		