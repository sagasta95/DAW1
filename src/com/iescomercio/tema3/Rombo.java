
package com.iescomercio.tema3;


public class Rombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k, x, y, z;
		
		for (i=1; i<5; i++){
			
			for (j=1; j<=4-i; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			
			for (k=1; k<(i*2)-2; k++){
				System.out.print(" ");
			}
			if (i>1){
			System.out.print("*");
			}
			
			System.out.println("");
			System.out.println("");
		}
		
		for (x=1; x<4; x++){
			
			for (y=1; y<=x; y++){
				System.out.print(" ");
			}
			System.out.print("*");
			
			for (z=1; z<4-(2*(x-1)); z++){
				System.out.print(" ");
			}
			if (x<3){
				System.out.print("*");
			}
			System.out.println("");
			System.out.println("");
		}

	}

}
