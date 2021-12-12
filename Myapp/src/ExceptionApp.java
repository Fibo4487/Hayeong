
public class ExceptionApp {
	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		try {
			System.out.println(2);
			System.out.println(4);
//			System.out.println(scores[3]);
			System.out.println(3);
			System.out.println(2/0);
			System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println("잘못된 계산"+e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
		System.out.println(5);
	}
}