import java.util.*;

public class AplusBwithCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for (int i = 1; i < N+1; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			System.out.println("Case #"+ i +": "+A+" + "+B+" = "+(A+B));
		}
	}

}
