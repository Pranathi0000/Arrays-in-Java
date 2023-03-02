/*
   2 arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all i.
     program to find whether 2 arrays are compatible or not.
     
 */
package arrays;

import java.util.Scanner;

public class CompatibleArray {

	public static void main(String[] args) {
		
       Scanner obj=new Scanner(System.in);// creating object of scanner class
		
		//taking the array size from the user
		
        System.out.println("Enter size of array: ");
        
		int arraySize=obj.nextInt();
		
		//declaring the arrays
		int[] array1=new int[arraySize];
		
		int[] array2=new int[arraySize];
		
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
		
 		System.out.println();
		//Checking the compatiblity
		
		if(array1[arraySize-1]>=array2[arraySize-1])
		{
		    System.out.println("Compatible");
		}
		else
		{
		    System.out.println("Incompatible");
		}
	
		
	
	}

}
