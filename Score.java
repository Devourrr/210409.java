package week3_day5;


class Score{
		
		private int kor;
		private int eng;
		private int math;	//�������
		
		
		public Score() { //�⺻ ������
		}
		
		
		public Score(int kor, int eng, int math) {
			this.kor = kor;
			this.eng = eng;
			this.math = math; 
			// �����ڿ� ������� �� �Է�
		}

		public String toString() {
			Score score = new Score(kor,eng,math);
			score.kor = 90;
			score.eng = 90;
			score.math = 100;
			
			return kor + " " + eng + " " + math;
			
		}
		
//		public String toString(kor) { // ������ ���ؼ� ������ ������
//			return kor + " " + eng +" " +math + " ";
	}


