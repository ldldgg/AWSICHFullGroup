
public class FlowTestEx1 {

	public static void main(String[] args) {
		
		int visitCount = 0;
		
		visitCount = 0;
		
		if(visitCount == 0) {
			System.out.println("처음 오셨군요.");
			System.out.println("방문해 주셔서 감사합니다");
		} else {
			System.out.println("다시 방문해 주셔서 감사합니다");
		}
	
			System.out.println("방문횟수는 " + ++visitCount + "번 입니다.");
			System.out.println();
		}

}
