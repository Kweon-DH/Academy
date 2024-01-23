package sc1;

public class Array2 {

	public static void main(String[] args) {
		//1. int형 배열 생성후 랜덤(1~100)이용해서 배열 크기 10 값 저장
		//2. 그 배열 총점, 평균 구하기
		boolean flag = false;
		int [] lotto = new int[6];
		for(int j=0; j<5; j++) {
		for (int i=0; i<lotto.length; i++) {
			int num = (int)(Math.random()*45)+1;
			for(int k=0; k<1; k++) {
			if(num == lotto[k]) {
				flag=true;
				break;
			}
		}
			if(flag) {
				i--;
				continue;
				
			}
			
			
			
			lotto[i] = num;
		
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("\n---------------------------------------");
	}
}
}

