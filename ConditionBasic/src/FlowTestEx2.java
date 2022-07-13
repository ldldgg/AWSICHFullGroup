import java.util.Scanner;

public class FlowTestEx2 {

	public static void main(String[] args) {

//		학점을 등급으로 표현하는 프로그램
//		100점이하 90이상이면 A
//		90미만 80이상이면 B
//		80미만 70이상이면 C
//		70미만 60이상이면 D
//		나머지는 F로 학점을 매긴다
		
//		점수는 사용자 키보드 입력을 받는다
		
//		당신의 점수는 ??이고 등급은 ??입니다.
//		로 출력한다
		
		
		Scanner scan = new Scanner(System.in);
		int score = 0;
		String gradeStr = "";
		
		System.out.println("점수를 입력해주세요");
		score = scan.nextInt();
		
		if(score <= 100 && score >= 90) {
			gradeStr = "A";
		}else if(score > 80) {
			gradeStr = "B";
		}else if(score > 70) {
			gradeStr = "C";
		}else if(score > 60) {
			gradeStr = "D";
		}else {
			gradeStr = "F";
		}
		
		System.out.println("당신의 점수는 " + score + "점 이고 당신의 등급은 "
			+ gradeStr + "입니다.");
		
		scan.close();
		
	}
}
