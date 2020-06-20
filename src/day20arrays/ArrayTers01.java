package day20arrays;
import java.util.Arrays;
public class ArrayTers01 {

	public static void main(String[]args) {
	   int arr1[]={1,2,3,4};
	  
	 
	   System.out.println(Arrays.toString(reverse(arr1)));
    }
	
	public static int[] reverse(int[] arr1) {
		int say=arr1.length-1;
		
		int arr[]=new int[arr1.length];
		
		for (int i=say;i>-1;i--){
		
			arr[say-i]=arr1[i];
	
		}
		
		  
		  return arr;
		}
	// artan donguyle ters yazdirma 
//	public static void main(String[] args) {
//
//		int arr [] = {1,2,3,4,5,6};
//		int arrTers [] = new int [arr.length];
//		
//		for (int i=0; i<arr.length ; i++ ) {
//			arrTers[i]=arr[arr.length-1-i];			
//		}
//		System.out.println(Arrays.toString(arrTers));
//	}
       
      }
