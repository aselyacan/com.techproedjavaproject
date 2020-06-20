package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
		/*
		 * Multi Dimesional array ile 2 . yontem 
		 *
		 */
		
		int arr[][]= {{1,2},{3},{4,5,6}};
		
		System.out.println(Arrays.toString(arr));// butun arraylarin ekrana yazilam methodu
		
		
		System.out.println(arr[0][1]+arr[1][0]+arr[2][2]);// 2+3+6=11 verir  
		
		
		// arr  arrayinde ki tum elemanlarin toplamini veren programi yazin 
		
		
		System.out.println(arr[0][0]+arr[0][1]+arr[1][0]+arr[2][0]+arr[2][1]+arr[2][2]);
		
		System.out.println("for loop ile olan kisa yol");
		
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			
			for (int j=0; j<arr[i].length; j++) {
				sum=sum+arr[i][j];
			}
		}
		
		System.out.println("Tum elemanlarin toplamini:" +sum);
	}

}
