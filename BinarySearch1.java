package DSA;         //code is not working properly for those targets which are not in array.5
import java.util.*;

public class BinarySearch1 
{
	public static int binarySearch(int arr[], int target)
	{
		int low=0, high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+(high-low))/2;
			
			if (arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				return low=mid+1;
			}
			else
			{
				return high=mid-1;
			}
		}
		return -1;	
	}


	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
	  System.out.println("Enter the size of array");
	  int n = sc.nextInt();
	  
	  System.out.println("Enter the elements in the array");
	  int arr[]=new int[n];
	  
	  for(int i=0;i<n;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  
	  System.out.println("target element");
	  int target=sc.nextInt();
		
	  int result=binarySearch(arr,target);
	  
	  if(result==-1)
	  {
		  System.out.println("Element not found in the array");
	  }
	  else
	  {
	  System.out.println("Element found at the index"+" "+result);
	  }
	}
}