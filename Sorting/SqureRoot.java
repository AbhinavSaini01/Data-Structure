package DSA;
import java.util.*;
public class SqureRoot {
	
	public static int findsquareRoot(int num)
	{
		int low=0,high=num,result=-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			int val=mid*mid;
			
			if(val==num)
			{
				return mid; //perfect square root
			}
			else if(val<num)
			{
				result=mid; //we stored mid value here for the numbers which are not perfect square root
							//their floor value gets stored here
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return result;
	}
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find sqroot");
		int num=sc.nextInt();
		
		int result=findsquareRoot(num);
		System.out.print(result);
		
	}

}
