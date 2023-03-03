/*
    Transpose of a array is changing rows to columns or vice versa.
     
    program to find the transpose of a 2D array.
    
*/

package arrays;

import java.util.Scanner;

public class TransposeOfArray {

	public static void main(String[] args) {
		
        Scanner obj=new Scanner(System.in);// creating object of scanner class
		
		//taking the array size from the user
		
        System.out.println("Enter size of array: ");
        
		int arraySize=obj.nextInt();
		
		//declaring the arrays
		int[][] array=new int[arraySize][arraySize];
		
		//resultant array
		int[][] transposedArray=new int[arraySize][arraySize];
		
		System.out.println("Enter the elements of first array:");
		
		//taking array from user
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=0;j<arraySize;j++)
			{
				array[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("first array:");
		
		//displaying 1st array
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=0;j<arraySize;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		//Transposing the array
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=0;j<arraySize;j++)
			{
				transposedArray[i][j]=array[j][i];
			}
		}
		
		System.out.println("Transpose of given arrays is: ");
		
		//transposed array
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=0;j<arraySize;j++)
			{
				System.out.print(transposedArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
