import java.util.*;

public class Sequence_For {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		ArrayList<Integer> c = new ArrayList<Integer>(); // ArrayList ��ü c ����
//		int[] d=new int[A]; // integer ������ Ÿ���� A��ŭ�� ũ�⸦ ���� �迭�� ����
		
		for (int i=0; i<A; i++) {
			c.add(scan.nextInt()); // c�� add�޼ҵ�� c�迭�� ���߰�
//			d[i]=scan.nextInt(); // d�� i ��° �ڸ��� nextInt�� �� �߰�
		}
		for (int i=0; i<A; i++) {
			if(c.get(i)<B) {
				System.out.print(c.get(i)+" "); // c �迭�� i ��°�� ���
			}
//			if(d[i]<B) {
//				System.out.print(d[i]+" ");
//			}
		}
		
		
	}

}
