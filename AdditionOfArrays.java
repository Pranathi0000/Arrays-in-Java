/*
    program to calculate the sum of two 2D arrays.
 */

package arrays;

import java.util.Scanner;

public class AdditionOfArrays {

	public static void main(String[] args) {
		
        Scanner obj=new Scanner(System.in);// creating object of scanner class
		
		//taking the array size from the user
		
        System.out.println("Enter size of array: ");
        
		int arraySize=obj.nextInt();
		
		//declaring the arrays
		int[][] array1=new int[arraySize][arraySize];
		
		int[][] array2=new int[arraySize][arraySize];
		
		//resultant array
		int[][] resultArray=new int[arraySize][arraySize];
		
		System.out.println("Enter the elements of first array:");
		
		//taking 1st array from user
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=0;j<arraySize;j++)
			{
				array1[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("first array:");
		
		//displaying 1st array
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=0;j<arraySize;j++)
			{
				System.out.print(array1[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Enter the elements of second array:");
		
		//taking 2nd array from user
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=0;j<arraySize;j++)
			{
				array2[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("second array:");
		
		//displaying 2nd array
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=0;j<arraySize;j++)
			{
				System.out.print(array2[i][j]+" ");
			}
			System.out.println("");
		}
		
		//Addition
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=0;j<arraySize;j++)
			{
				resultArray[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		System.out.println("Addition of arrays is: ");
		
		//result array
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=0;j<arraySize;j++)
			{
				System.out.print(resultArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
