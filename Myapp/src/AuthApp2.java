
public class AuthApp2 {
	
	public static void main(String[] args) {
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String pass2 = "2222";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		boolean isRightPass = (inputPass.equals(pass) || inputPass.equals(pass2));
		if(inputId.equals(id) && isRightPass) {
			System.out.println("Master!");
			
		} else {
			System.out.println("Who are you?");
		}
	}

}
//String o1 = new String("java") String o2 = new String("java")
//(o1 == o2)는 false (o1.equals(o2))는 true가 나온다
//==는 value를 비교하여 같은곳에 있는지 확인하고, 
//equals는 value가 다른곳에 있더라도 값이 같은지 비교해준다.
