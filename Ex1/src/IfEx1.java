
public class IfEx1 {

	public static void main(String[] args) {
		
		
		int a = 511666;
		int b = 90001;
		int c = 8995559;
		
		
		int maxNum = 0;
		int minNum = 0;
		
		if (a > b && a > c) {
			maxNum = a;
			if (b > c) {
				minNum = c;
			}else
				minNum = b;
		}else if (b > a && b > c) {
			maxNum = b;
			if (a > c) {
				minNum = c;
			}else
				minNum = a;
		}else {
			maxNum = c;
			if (a > b) {
				minNum = b;
			}else
				minNum = a;	
		}
		
		System.out.println("최대값 : " + maxNum);
		System.out.println("최소값 : " + minNum);
		
	}
}

