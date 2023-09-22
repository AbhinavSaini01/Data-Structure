package DSA;
import java.util.*;
public class FibonnaciSeries 
{
	public static int FindingFib(int num)
	{
		if(num<=1)  //Base Case Condition
		{
			return num;
		}
		else
		{
			return FindingFib(num-1)+FindingFib(num-2); //Recursive Calls
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
	 
		int result=FindingFib(num);
		System.out.println("Fibonacci Series is :"+ result);

	}

}
