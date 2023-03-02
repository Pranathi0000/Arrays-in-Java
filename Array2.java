package arrays;

import java.util.Scanner;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		int[] arr= {2,4,5,7,1,3,};
		int[] arr1= {1,2,3};
		
	     if(arr.equals(arr1))
	     {
	    	 System.out.println("Same");
	     }
	     else
	     {
	    	 System.out.println("Not Same");
	     }

	     System.out.println(arr.hashCode());
	     System.out.println(arr1.hashCode());
	     
	     //sorting the array
	     Arrays.sort(arr);
	     System.out.println(Arrays.toString(arr));
	     
	     //Dynamic array
	     
	     Scanner obj=new Scanner(System.in); 
	     
	     System.out.println("Enter the size of an array: ");
	     int n=obj.nextInt();
	     
	     int[] array=new int[n];
	     
	     for(int i=0;i<n;i++)
	     {
	    	 array[i]=obj.nextInt();
	     }
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println(arr[i]);
	     }
	     
	     // array doesn't support type casting
	     //float[] array=new int[6];
	     
	     // doesn't support size compression
	     //throws array out of bounds exception
	     
	}
	

}
