import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(sol(x, y));
		
	}
	
	public static int sol(int x, int y) {
		if(x > 0) {
			if(y > 0) return 1;
			else return 4;
		}else {
			if(y > 0) return 2;
			else return 3;
		}
	}
}
