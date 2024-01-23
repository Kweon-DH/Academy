package sc1;

import java.util.Scanner;

public class 별표찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("길이 : ");
		int len = input.nextInt();
		
		for(int i=0; i<len; i++) { //5번 밑으로 회전  /* 여기서부터
			for (int j=0; j<i; j++){ //빈칸 출력
				System.out.print(" ");
				}
		
		
		for(int j= 0; j<(2*len)-1-(i*2); j++) {
			System.out.print("*"); //별표 찍기
		}
			System.out.println(""); //줄 변경  	여기까지 반복 */
		}
		
	}	

}
