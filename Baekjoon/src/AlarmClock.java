import java.util.Scanner;
public class AlarmClock {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt(); // �ð�
		int B = scan.nextInt(); // ��
		int C = A - 1;          // ��-45 -�ϰ�� �ð�-1
		int D = B - 45;         //��-45
		int E = 60 + D;         //d�� ������ ���
		
		if (A > 0 && D < 0) {
			System.out.printf(C+" "+E);
		} // 0�� �̻��̸鼭 45�� ����
		else if (A == 0 && D < 0) {
			System.out.printf("23 "+E);
		} // 0�� �̸鼭 45�� ����
		else if (A >= 0 && D >= 0 ) {
			System.out.printf(A+" "+D);
		} // 0�� �̻��̸鼭 45�� �̻�
		scan.close();
	}

}
