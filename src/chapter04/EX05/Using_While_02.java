package chapter04.EX05;

import java.util.Scanner;

public class Using_While_02 {

	public static void main(String[] args) {
		// "그만" 할 때까지 정수값을 넣어서 합계와 평균(double)을 출력
		// 1. String s = sc.nextLine(); 인풋 받기
		// 2. s.split(" "); < 공백을 기준으로 잘라서 배열에 저장
		// 3. 문자형 String을 정수형으로 변환, Integer.PerseInt()
		// 4. 합계와 평균을 구하기.
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		do {
			System.out.println("정수를 입력하세요. 그만을 입력해 프로그램을 멈추세요.");
			s = sc.nextLine();
		if(s.equals("그만")) {break;}
			String[] arr;
			arr = s.split(" ");
			int b = 0;
			int sum = 0;
			int count = 0;
				for(int i =0; i<arr.length; i++) {
					if(i%2!=0) {
						b = Integer.parseInt(arr[i]);
						sum+=b;
						count++;
					}
				}System.out.println("정수의 합: " + sum);
				System.out.println("정수의 평균: " + sum/(double)count);
		}while(true);
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		// [선생님 해설지]
		// Scanner sc = new Scanner(System.in);
		// String s;
		
		do {
			System.out.println("정수 값을 공백을 이용해서 넣으세요.");
			System.out.println("예) 입력 >>> 10 40 50 70 >>>");
			s = sc.nextInt();
			if(s.equals("그만")) { break;}
			String[]arr;
			arr = s.split(" ");
			int b;
			int sum = 0;
			int count = 0;
			for(int i = 0; i<arr.length; i++) {
				
				b = Integer.ParsenInt(arr[i]);
				sum+=b;
				count++;
			}
			System.out.println("정수의 개수: "+count);
			System.out.println("정수의 합: "+sum);
			System.out.println("정수의 평균: "+sum/(double)count);
			System.out.println();
		}while(true);
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
}
