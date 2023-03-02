/*
   Program to calculate the sum of two 1D arrays.
 */
package arrays;

import java.util.Scanner;

public class SumOfarrays1D {

	public static void main(String[] args) {
		

        Scanner obj=new Scanner(System.in);// creating object of scanner class
		
		//taking the array size from the user
		
        System.out.println("Enter size of array: ");
        
		int arraySize=obj.nextInt();
		
		//declaring the arrays
		int[] array1=new int[arraySize];
		
		int[] array2=new int[arraySize];
		
		//resultant array to store the sum
		int[] resultArray=new int[arraySize];
		
		System.out.println("Enter the elements of first array:");
		
		//taking 1st array from user
		
		for(int i=0;i<arraySize;i++)
		{
				array1[i]=obj.nextInt();
			
		}
		
	 System.out.println("first array:");
		
		//displaying 1st array
		
 		for(int i=0;i<arraySize;i++)
 		{
	         System.out.print(array1[i]+" ");
		}
		
		System.out.println("\nEnter the elements of second array:");
		
		//taking 2nd array from user
		
		for(int i=0;i<arraySize;i++)
		{
			
				array2[i]=obj.nextInt();
		}
		
		System.out.println("second array:");
		
		//displaying 2nd array
		
		for(int i=0;i<arraySize;i++)
 		{
 				System.out.print(array2[i]+" ");
		}
		
		//Addition
		
		for(int i=0;i<arraySize;i++)
		{
				resultArray[i]=array1[i]+array2[i];
		}
		
	
	System.out.println("\nAddition of arrays is: ");
		
		//result array
		
		for(int i=0;i<arraySize;i++)
		{
				System.out.print(resultArray[i]+" ");
		
		}
	}

}
