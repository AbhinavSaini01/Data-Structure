package DSA;
import java.util.*;

public class SumOfDigits 
{
	public static int sumOfDigits(int num) 
	{
		int sum;
		if(num==0) // base case condition
		{
			return 0;
		}
		else
		{
			int rem =(num)%10;
			num=num/10;
			return sum = rem+ sumOfDigits(num);  //recursive call
		}
	
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int result=sumOfDigits(num);
		System.out.println("The sum of the digits is: "+result);

	}

}
