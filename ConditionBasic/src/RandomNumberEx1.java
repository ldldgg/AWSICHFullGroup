import java.io.IOException;

public class RandomNumberEx1 {
	
	public static void main(String[] args) throws IOException {
		
//		랜덤한 숫자
//		임의의 숫자를 구하는 방법
		
		int rndNum = 0;
		
		rndNum = (int)(Math.random() * 10) + 10;
		
		System.out.println(rndNum);
				
		int a = 0;
		a = System.in.read();
		
		
		System.out.println(a);
		
		
		
		
	}
}
