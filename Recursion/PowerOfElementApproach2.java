package DSA;
import java.util.*;
import java.math.*;
//Optimized approach (Divide and conquer)
//Time comp.=O(log n)
//Space comp.=O(n)
/*In this code we use BigInteger instead of int,long and double because not any of that can solve more than 2^32 
  so we use BigInteger class. And it has different methods of add,subt,mul,divide so take care of that. */



public class PowerOfElementApproach2 
{
	public static BigInteger powerFind(BigInteger a,int b)
	{
		BigInteger result, finalResult;
		int mid=0;
		if(b==1) //base case condition
		{
			return a;
		}
		else if(b==0)
		{
			return BigInteger.valueOf(1); //conversion of Int(1) to BigInteger(1).
		}
		else
		{
			mid=b/2;  //here we divided b(power) into 2 parts so that calculation is to be done on half part.
		  result=powerFind(a,mid);
		  finalResult=result.multiply(result); //here half answer multiplied to it again to get full answer
		  
		  if(b%2==0)  
		  { 
			  return finalResult; //if b is even
		  }
		  else 
		  {
			 return  a.multiply(finalResult); //if b is odd 
		  }
		} 
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number a and b: ");
		
		BigInteger a=sc.nextBigInteger();
		int b=sc.nextInt();
		BigInteger result=powerFind(a,b);
		System.out.println(result);

	}

}
