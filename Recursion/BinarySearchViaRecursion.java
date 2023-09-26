package DSA; //code not working for elements not present in array 
import java.util.*;

public class BinarySearchViaRecursion 
{
	public static int binarySearch(int arr[], int low, int high, int target)
	{
		int result= -1;
		while(low<=high)
		{
			int mid = low+(high-low)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				return binarySearch(arr,mid+1,high,target);
			}
			else
			{
				return binarySearch(arr,low,mid-1,target);
			}
		}
		return result;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			 arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the target element");
		int target=sc.nextInt();
		
		//function calling
		int result=binarySearch(arr,0,arr.length-1,target);
		
		if(result != -1)
		{
			System.out.println("Element found at the inex: "+result);
		
		}
		else
		{
			System.out.println("Element not found in the array");	
		}
		
	}

}
