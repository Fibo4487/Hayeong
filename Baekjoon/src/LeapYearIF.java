import java.util.Scanner;

public class LeapYearIF {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}

}
// 콘솔창에서 결과를 입력하게 해줄수 있는 util.Scanner
// 인스턴스 생성 해주고 Scanner(System.in) 해주고  y = sc.nextInt()로 정수값으로 변수에 넣어준다
// 논리연산자 && || 사용