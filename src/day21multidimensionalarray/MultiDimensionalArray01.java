package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		/*
		 * Multidimention ARRAY olusturma 2 boyutlu olustuma  ic ice array demek  array icinde arra olan elemanlar 
		 * 
		 */

		int arr[][]=new int[3][4];
				
		System.out.println(Arrays.toString(arr));// [[I@15db9742, [I@6d06d69c, [I@7852e922] icerdeki  3 tane arrazlarin referenclari 
		
		System.out.println(Arrays.deepToString(arr));//[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]  butun icteki arraylarin elemanlarini yazdirma methodu
		
		
		// assignment or atama  1 yontem 
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=4;
		
		arr[1][0]=5;
		arr[1][1]=6;
		arr[1][2]=7;
		arr[1][3]=8;
		
		arr[2][0]=9;
		arr[2][1]=10;
		arr[2][2]=11;
		arr[2][3]=12;
		   
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr[1][2]);//7
		
		System.out.println(arr[0][3]+arr[2][1]);// 4 +10=14   once distaki array index  sonra icteki arra 
		
		
		int a[][]=new int[10][10];
		   
		   for (int i=0; i<10; i++){
		     
		     for ( int j=0; j<10; j++){
		       System.out.print("Beklenen Cikti:"+a[i][j]);
		     }
		   }
		   System.out.println();

		
		
	}

}