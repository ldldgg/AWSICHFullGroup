import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {

//		중첩 if문
//		
//		if(조건식1) {
//			조건식1이 참 일때 
//			if(조건식2) {
//				조건식2가 참 일때
//			}else {
//				조건식2이 참 이고, 조건식2가 거짓 일때
//			}
//		}else {
//			조건식1이 거짓 일때
//		}

//		95점이상 A+
//		92점이하 A-
	
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		
		int score = scan.nextInt();
		String grade = "";

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade = grade + "+";
			} else if (score <= 92) {
				grade = grade + "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade = grade + "+";
			} else if (score <= 82) {
				grade = grade + "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade = grade + "+";
			} else if (score <= 72) {
				grade = grade + "-";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 65) {
				grade = grade + "+";
			} else if (score <= 62) {
				grade = grade + "-";
			}
		} else {
			grade = "F";
		}

		System.out.println("당신의 점수는 " + score + "점 입니다." 
			+ "등급은 " + grade + " 입니다.");
		
		scan.close();
		

	}

}
