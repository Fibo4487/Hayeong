import java.util.Scanner;
public class AlarmClock {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt(); // 시간
		int B = scan.nextInt(); // 분
		int C = A - 1;          // 분-45 -일경우 시간-1
		int D = B - 45;         //분-45
		int E = 60 + D;         //d가 음수일 경우
		
		if (A > 0 && D < 0) {
			System.out.printf(C+" "+E);
		} // 0시 이상이면서 45분 이하
		else if (A == 0 && D < 0) {
			System.out.printf("23 "+E);
		} // 0시 이면서 45분 이하
		else if (A >= 0 && D >= 0 ) {
			System.out.printf(A+" "+D);
		} // 0시 이상이면서 45분 이상
		scan.close();
	}

}
