package sc1;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("길이 : ");
		
		int len = input.nextInt();
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<i; j++) {
				System.out.println(" ");
			}
		for(int j=0; j<(2*len)-1-(i*2); j++) { 
			System.out.println("*");
		}
		
		}
		System.out.println("");
	}
}

