package DSA;
import java.util.*;

public class FactorialViaRecursion 
{
	public static int FindingFactorial(int num)
	{
		int result=0;
		if(num==0 || num==1)  //Base case condition
		{
			return 1;
		}
		else
		{
			result= num * FindingFactorial(num-1); //Recursive calls
		}	
		return result;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int result=FindingFactorial(num);
		System.out.println("Factorial of the number is :"+ result);
	}
}
