/*
  Program to count the number of distinct number of elements present in the given 1D array.
  
 */
package arrays;

import java.util.Scanner;

public class DistinctElements {

	public static void main(String[] args) {
		

	       Scanner obj=new Scanner(System.in);// creating object of scanner class
			
			//taking the array size from the user
			
	        System.out.println("Enter size of array: ");
	        
			int arraySize=obj.nextInt();
			
			//declaring the arrays
			int[] array=new int[arraySize];
			
			System.out.println("Enter the elements of array:");
			
		   //taking 1st array from user
			
			for(int i=0;i<arraySize;i++)
			{
					array[i]=obj.nextInt();
				
			}
			
			//Displaying the array
			
			for(int i=0;i<arraySize;i++)
			{
					System.out.print(array[i]+" ");
				
			}
			
			int temp=1; //intializing a temporary variable to count the distinct elements
			
			for(int i=0;i<arraySize;i++)
			{
			        if(array[0]!=array[i])
			    {
			        temp++;
			    }
			    
			    
			    
			}
			System.out.println("Distinct elemnts are: "+temp);
	}

}
