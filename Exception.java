import java.util.*;

class Exception
{
	public static void main(String args[])
	{
		try
		{
			Scanner x=new Scanner(System.in);
			System.out.println("enter the value of a and b");
			int a;
			int b,c;
			a=x.nextInt();
			b=x.nextInt();
			c=a/b;
			System.out.println("q="+c);
			//throw new ArithmeticException ("Divisor can't be zero");
			try
			{
				int d[]=new int[1];
				System.out.println("enter the third value");
				d[2]=x.nextInt();
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("index not found");
			}
		}		
		catch(ArithmeticException e)
		{
			System.out.println("divisor can't be zero");
		}
				finally
		{
			System.out.println("end of program!");
		}
	}
}		
