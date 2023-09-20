package DSA;
import java.util.*;
import java.io.*;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements in the array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the target element");
		int x=sc.nextInt();
		
		int index=-1;
		for(int i=0;i<n;i++)
		{
			if (arr[i]==x)
			{
				index=i;
				break;
			}
		}
		
		if(index==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found on the index : "+ index);
		}
		

	}

}
