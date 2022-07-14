
public class IfEx2 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*20) + 100 ;
		System.out.print("키가 " + a + "cm 입니다 ");
//		boolean p = true;
		if (a >= 110) {
			System.out.println("탑승이 가능합니다");
		} else {
			System.out.println("보호자가 필요합니다");
			if (a%2==0) {
				System.out.println("보호자 있음");
				System.out.println("보호자와 같이 동반 탑승해주세요");
			} else {
				System.out.println("보호자 없음");
				System.out.println("다음에 보호자와 같이 와주세요");
			}
		}
		
		
		
	}
}

