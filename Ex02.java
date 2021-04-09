package week3_day5;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score[] arr = new Score[3];	// 참조형변수 3개가 배열로 만들어짐
		
		System.out.println(arr[0]); //null 출력
		
		arr[0] = new Score(90,80,100);
		arr[1]= new Score(100,90,90);
		arr[2]= new Score(100,90,90);
		
		System.out.println(arr[0]);	
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	
//	for(int i=0; i< arr.length; i++) {
//		System.out.println(arr[i], toString());
//	}
}
}
