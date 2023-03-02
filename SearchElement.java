/*
      Program to search the given element from the 1D-array
 */

package arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		
          Scanner obj=new Scanner(System.in);// creating object of scanner class
		
		//taking the array size from the user
		
        System.out.println("Enter size of array: ");
        
		int arraySize=obj.nextInt();
		
		//declaring the arrays
		int[] array=new int[arraySize];
		
	   //taking elements of array from user
		
		for(int i=0;i<arraySize;i++)
		{
				array[i]=obj.nextInt();
			
		}
	   
		System.out.println("Enter the element you want to find: ");
		
	   int ElementToFind = obj.nextInt(); //taking the element that has to be find
	   
	   for(int i=0;i<arraySize;i++)
	   {
	       if(ElementToFind==array[i])
	       {
	           
		    System.out.println(array[i]+" is present in the array");
		    break;
	       }
	       else if(i==arraySize-1)
	       {
	           
		    System.out.println(ElementToFind +" is not present in the array");
	       }
	   }
	}

}
