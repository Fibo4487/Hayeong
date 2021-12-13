import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count= sc.nextInt();
		String star = "*";
		
		for (int a = 0; a < count; a++) {
			for (int b = count-a-1; b > 0; b--) {
				System.out.print(" ");
			}
			for (int c = 0; c < a+1; c++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}
}
