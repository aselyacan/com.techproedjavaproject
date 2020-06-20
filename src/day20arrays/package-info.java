package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String []args) {
		
//		
//		 Scanner sc=new Scanner(System.in);
//		   
//		   int uzun1=sc.nextInt();
//		   int arr1[]= new int[uzun1];
//		   
//
//		   
//		   
//		   Arrays.sort(arr1);
//		  
//		   System.out.println(Arrays.toString(arr1));
		
		int arr1[]={1232,1134,2345,1022};
		   
		String arr2[]={"Java","Python","PHP","C#","c Programming","C++"};
		   
		   
		   Arrays.sort(arr1);
		   Arrays.sort(arr2);
		   System.out.println(Arrays.toString(arr1));
		   System.out.println(Arrays.toString(arr2));   
		   
		      // Write your code here
		   int array[]={1,2,3,4,5,6,7,8,9,10};

		   int sum=0;

		   for (int i=0; i<=array.length; i++){
		     
		     sum=sum+i;
		     
		     
		     
		   }System.out.println(sum);
		
		
	}
}