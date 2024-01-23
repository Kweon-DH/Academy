package sc1;

import java.util.Scanner;

public class Continue01 {

	public static void main(String[] args) {
		// 1부터 10사이의 홀수의 합을 구하라
		
		int sum2 = 0;
		for(int i=1; i<=10; i+=2) {
			sum2 += i;
		}
		System.out.println("홀수 합 : " + sum2);	
		
	
		int sum3 = 0;
		for(int j=1; j<=10; j++) {
			if(j % 2 == 0)
				continue; //if가 참이면 밑에 문장으로 가지 말고 다시 증감식으로 올라감
			
			sum3 += j;
		}
		System.out.println("홀수 합 : " + sum3);
	
	
	
	
	
	
	
	}
	
	
	} 


