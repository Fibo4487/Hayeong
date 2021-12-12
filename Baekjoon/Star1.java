import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count= sc.nextInt();
		String star = "*";
		
		for (int a=0; a<count; a++) {
			for (int b=0; b<a+1; b++) {
			System.out.print(star);
			}
			System.out.println("");
		}

	}
}
