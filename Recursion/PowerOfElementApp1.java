package DSA;
//Brute Force Approach
//Time complexity = O(n)
//Space complexity = O(n)

public class PowerOfElementApp1 
{
	public static int powerFind(int a, int b)
	{
		int result=0;
		
		if(b==1) //base case condition
		{
			return a;
		}
		else if(b==0)
		{
			return 1;
		}
		else
		{
			return result =a* powerFind(a,b-1); //recursive calls
		}
	}

	public static void main(String[] args)
	{
		int a=2,b=0;
		int result=powerFind(a,b);
		System.out.println(result);
	}

}
