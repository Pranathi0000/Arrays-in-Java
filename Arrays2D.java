// 2D arrays

package arrays;

import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		
		    Scanner obj=new Scanner(System.in);
		    
		    System.out.println("Enter thr size of an array: ");
		    
		    int n=obj.nextInt();  //size of the array
		    
		    //declaring a 2D array
		   
		    int[][] array=new int[n][n];
		    
		    //taking elements from the user
		    
		    System.out.println("Enter the array elements: ");
		    
		    for(int i=0;i<n;i++)
		    {
		    	for(int j=0;j<n;j++)
		    	{
		    		array[i][j]=obj.nextInt();
		    	}
		    }
		    
		    //displaying the array
		    
		    System.out.println("The array is: ");
		    
		    for(int i=0;i<n;i++)
		    {
		    	for(int j=0;j<n;j++)
		    	{
		    		 System.out.print(array[i][j]+" ");
		    	}
		    	System.out.println("");
		    }
		
		
	}

}
