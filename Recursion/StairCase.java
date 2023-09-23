package DSA;

public class StairCase 
{
	public static int  countWays(int n)
	{
		int result=0;
		if(n<=1)
		{
			return n;
		}
		else
		{
			return result=countWays(n-1)+countWays(n-2);
		}
	}

	public static void main(String[] args) 
	{
		int n=4;
	    int result=countWays(n+1);
		System.out.println(result);
	}

}
