//Array introduction

package arrays;

public class Array1 {

	public static void main(String[] args) {

          //array is a class comes under lang package
		  // execution starts from RHS 
		
		//declaring an array
		
	  //	int[] arr =new int[3];
	   //   5  6  7  1  2   3  4
		
		/*
		     Execution Process:
		     1 --> starts from '=' sign
		     2 --> then we tell jvm to allocate a new address location
		     3 --> type casting 
		     4 --> the blocks needed are 3
		     5 --> declaring the object is of integer type
		     6 --> [] indicates it is an array
		     7 --> name of the array
		     
		 */
		
		//declaring a integer array
		int[] arr = {1,2,3};
		
		System.out.println(arr[1]);
		
		//declaring a float array
		float[] interest= {2.3F,1.2f,0.6f}; // JVM takes a default floatNumber as double so we have to specify the number with f 
		
		System.out.println(interest[1]);
		
		//declaring a char array
         char[] alphabets= {'a','b','c'};
         
         System.out.println(alphabets[1]);
         
         //declaring a string array
        String[] names= {"Rama","Hanuman","Seetha","Lakshman"};
         
        System.out.println(names[1]);
		
         
         //back-end of array Creation
         
         /*
             1--> Take the required blocks according to the dataType
             
             2--> merges the blocks (if it is of integer data
             type it merges 4 blocks)
             
             3-->Makes the starting block address as default address of that block
             
             4-->elements of the array are stored according to the formula:
                startValue+(arrayIndex*numberOf dataType blocks)
                
                startValue= starting address location
                arrayIndex=index of the element
                numberOf dataType blocks= as per dataType size
          */
         
         
	}

}
