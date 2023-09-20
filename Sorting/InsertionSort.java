package DSA;

import java.util.Arrays;

public class InsertionSort
{
	public static void insertionsort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int j=i;
			while(j>0 && arr[j]<arr[j-1])
			{
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}

	
	public static void main(String[] args) 
	{
		int arr[]= {23,1,45,2,67,234,4,89,65};
		insertionsort(arr);
		System.out.println("Sorted array is :");
		System.out.println(Arrays.toString(arr));

	}

}
