import java.util.Scanner;

public class FlowTestEx3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		
		int score = scan.nextInt();
		String grade = "";

//		if (score >= 80) {
//			grade = "B-";
//		}else {
//			grade = "F";
//		}
//		if (score >= 83) {
//			grade = "B";
//		}
//		if (score >= 85) {
//			grade = "B+";
//		}
//		if (score >= 90) {
//			grade = "A-";
//		}
//		if (score >= 93) {
//			grade = "A";
//		}
//		if (score >= 95) {
//			grade = "A+";
//		}

		
		if (score >= 95) {
			grade = "A+";
		}else if (score >= 93) {
			grade = "A";
		}else if (score >= 90) {
			grade = "A-";
		}else if (score >= 85) {
			grade = "B+";
		}else if (score >= 83) {
			grade = "B";
		}else if (score >= 80) {
			grade = "B-";
		}else {
			grade = "F";
		}
		
		
		
		
	
		System.out.println("당신의 점수는 " + score + "점 입니다." 
			+ "등급은 " + grade + " 입니다.");
		
		scan.close();
		

	}

}
