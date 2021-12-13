import java.util.*;

public class Sequence_For {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		ArrayList<Integer> c = new ArrayList<Integer>(); // ArrayList 객체 c 생성
//		int[] d=new int[A]; // integer 데이터 타입의 A만큼의 크기를 가진 배열을 생성
		
		for (int i=0; i<A; i++) {
			c.add(scan.nextInt()); // c의 add메소드로 c배열에 값추가
//			d[i]=scan.nextInt(); // d의 i 번째 자리에 nextInt로 값 추가
		}
		for (int i=0; i<A; i++) {
			if(c.get(i)<B) {
				System.out.print(c.get(i)+" "); // c 배열의 i 번째를 출력
			}
//			if(d[i]<B) {
//				System.out.print(d[i]+" ");
//			}
		}
		
		
	}

}
