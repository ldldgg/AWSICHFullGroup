
public class FlowEx4 {

	public static void main(String[] args) {

//		if-else if문
//		if(조건식1) {
//			조건식1이 참 일때 수행될 문장
//		}else if(조건식2) {
//			조건식2가 참 일때 수행될 문장
//		}else {
//			조건식이 하나라도 거짓 일때 수행될 문장
//		}

		
		int score = 0;
		String gradeStr = "";
		
		score = 85;
		
		if(score >= 90) {
			gradeStr = "A";
		}else if(score >= 80) {
			gradeStr = "B";
		}else {
			gradeStr = "F";
		}
		
		System.out.println("당신의 등급은 " + gradeStr + "입니다.");
		

	}

}
