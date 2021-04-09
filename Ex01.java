package week3_day5;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Score s = new Score(90,90,100);
		System.out.println(s.toString());
		
//		String a="hhhhhh";
//		a.compareTo("jjjjj");
		 Scanner sc = new Scanner(System.in);
		 Score[] arr = new Score[3];
		 for(int i=0; i< arr.length; i++) {
			 int kor = sc.nextInt();
			 int eng = sc.nextInt();
			 int math = sc.nextInt();
			 
			 arr[i] = new Score(kor, eng, math);
		 }
		// 3명 학생정보 출력하기
		 for(int i=0; i< arr.length  ; i++) {
				System.out.println( arr[i].toString());
		 }
	}
	
		
	}




