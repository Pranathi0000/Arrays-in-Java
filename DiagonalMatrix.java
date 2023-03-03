package arrays;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
         
		System.out.println("Enter the size of the array: ");
		
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
		
		int p=0,q=0; //temporary variables for checking the conditions
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i!=j && array[i][j]!=0) //checks whether the diagonal elements are not zero
				{
					p=1;
					break;
				}
				if(i==j && array[i][j]!=0) //checking other elements other than diagonal elements
				{
					q++;
				}
			}
		}
		
		//checking whether the diagonal elements are non zero and other elements are zero
		
		if(p==0&& q==size)
		{
			System.out.println("Diagonal matrix");
		}
		else
		{
			System.out.println("Not a Diagonal matrix");
		}
	}

}
