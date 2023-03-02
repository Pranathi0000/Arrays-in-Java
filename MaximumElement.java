/*
   Program to print the maximum element from the given 1D-array.
 */
package arrays;

import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		
          Scanner obj=new Scanner(System.in);
        
        System.out.println("enter the size of the array: ");
        
        //Taking size of the array
       int size=obj.nextInt();
       
       //declaring an array
       int[] array=new int[size];
       
       //taking elements of an array from the user
       for(int i=0;i<size;i++)
       {
           array[i]=obj.nextInt();
       }
       
       //finding the biggest number from the array
        
        int maxElement=array[0]; //assuming the intial element as the biggest
        
        for(int i=1;i<size;i++)
        { 
            //comparing every element with maxElement if it is greater then changing the maxElement
            
            if(maxElement<array[i])
            {
                maxElement=array[i];
            }
        }
        
        System.out.println(maxElement+" is the maximum element in the array");
	}

}
