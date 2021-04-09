package week3_day5;


class Score{
		
		private int kor;
		private int eng;
		private int math;	//멤버변수
		
		
		public Score() { //기본 생성자
		}
		
		
		public Score(int kor, int eng, int math) {
			this.kor = kor;
			this.eng = eng;
			this.math = math; 
			// 생성자에 멤버변수 값 입력
		}

		public String toString() {
			Score score = new Score(kor,eng,math);
			score.kor = 90;
			score.eng = 90;
			score.math = 100;
			
			return kor + " " + eng + " " + math;
			
		}
		
//		public String toString(kor) { // 생성자 통해서 변수값 얻어오기
//			return kor + " " + eng +" " +math + " ";
	}


