
public class SwitchEx1 {

	public static void main(String[] args) {

//		switch(조건식) {
//		case 값1:
//			조건식의 결과가 값1과 같을 경우 수행
//		break;
//		case 값2:
//			조건식의 결과가 값2와 같을 경우 수행
//		break;
//		default:
//			조건식의 결과와 일치하는 case문이 없을 때 수행
//		}
		
//		switch문의 제약조건
//		조건식의 결과값이 반드시 정수여야 한다
//		조건식 결과는 정수 또는 문자열
//		case문은 값은 정수 상수만 가능, 중복되면 안된다
		
		int choiceNum = 0;
		
		choiceNum = (int)(Math.random() * 10);
		choiceNum = choiceNum * 100; 
		
		System.out.print("당신의 번호는 " + choiceNum + "입니다 ");
		
		switch (choiceNum) {
			case 100:
				System.out.println("상품은 자전거 입니다");
				break;
			case 200:
				System.out.println("상품은 TV 입니다");
				break;
			case 300:
				System.out.println("상품은 노트북 입니다");
				break;
			case 400:
				System.out.println("상품은 자동차 입니다");
				break;
			case 500:
				System.out.println("상품은 컴퓨터 입니다");
				break;
			default:
				System.out.println("꽝 다음 기회를 기대해주세요");
				break;
		}
		
		System.out.println("프로그램을 종료합니다");

		
	}

}
