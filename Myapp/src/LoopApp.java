
public class LoopApp {
	public static void main(String[] args) {
		
		 	System.out.println(1);
	        System.out.println("=== while ===");
	        int i = 0;
	        //..
	        while(i < 3) {
	            System.out.println(2);
	            System.out.println(3);
//	          	(i = i + 1;) = (i++;) 
	            //..
	            i++;
	        }
	        System.out.println("=== for ===");
	        for(int j=0; j < 3; j++) {
	            System.out.println(2);
	            System.out.println(3);
	        }
	         
	        System.out.println(4);
	 
	}
	//for문의 순서 (초기값, 한계값(불린), 증감값)
	//while은 좀더 자유로움, for문은 가로안에 순서가 약속되어있음

}
	
