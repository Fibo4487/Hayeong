import java.util.Scanner;

public class LeapYearReturn {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int y = scan.nextInt();
		
		System.out.println(sol(y));
		
	}

	public static int sol(int y) {
		 int result;
		   result =   y % 4 == 0 && (y % 100 != 0 || y % 400 == 0) ? 1 : 0;

		      return result;
	}
}

// sol 이라는 메소드를 생성 해주고 return 으로 결과값을 출력 해주는 방식


