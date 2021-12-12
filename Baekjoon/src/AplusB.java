import java.util.Scanner;

public class AplusB {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
	int B = scan.nextInt();
	scan.close();
	
	String strB = Integer.toString(B);
	try {
	for (int i = 2; i < strB.length(); i--) {
		int temp = Character.getNumericValue(strB.charAt(i));
		System.out.println(A * temp);

	}

}	catch(Exception e) {
	System.out.println(A*B);
}
	
}
}