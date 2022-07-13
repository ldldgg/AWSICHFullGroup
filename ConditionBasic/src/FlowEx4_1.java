import java.util.Scanner;

public class FlowEx4_1 {

	public static void main(String[] args) {


		
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		String grade = "";

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("당신의 점수는 " + score + "점 입니다." 
			+ "등급은 " + grade + " 입니다.");
		
		scan.close();
	}

}
