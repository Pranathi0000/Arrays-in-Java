/*
    Program to print maximum element in each row in the array.
    
 */

package arrays;

import java.util.Scanner;

public abstract class MinimumElementInRow {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
//System.out.println("Enter the size of the array: ");
		
		int size=obj.nextInt(); //taking array size from the user
		
		//declaring a 2D array
		int[][] array=new int[size][size];
		
		//taking array elements from the user
		System.out.println("Enter the elements: ");
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				array[i][j]=obj.nextInt();
			}
		}
		
		//taking a maxElements array 
		//this stores each greatest element in each row
		
		int[] maxElement=new int[size];
		
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
					maxElement[i]=array[i][0]; //assumes 1st element in each row as greatest
					
				if(i==0 && maxElement[i]>array[i][j])
				{
					maxElement[i]=array[i][j];
				}
				if(i==1 && maxElement[i]>array[i][j])
				{
					maxElement[i]=array[i][j];
				}
				if(i==2 && maxElement[i]>array[i][j])
				{
					maxElement[i]=array[i][j];
				}
				
			}
			
		}
		
		//displaying the maximum element in each row
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Minimum number in " +i+ " row "+ " is: "+ maxElement[i]);
		}
	}

}

