
public class AuthApp3 {

	public static void main(String[] args) {
	
		//String[] users = {"egoing", "jinhuck", "youbin"};
		String[][] users = {
				{"egoing", "1111"},
				{"jinhuck", "2222"},
				{"youbin", "3333"},
				
		};
		String inputId = args[0];
		String inputPass = args[1];
		String current[] = null;
		boolean isLogined = false;
		
		for(int i=0; i<users.length; i++) {
			current = users[i];
			if(
					checkId(current[0], inputId) &&
					checkPass(current[1], inputPass)
			) {
				isLogined = true;
				break;
			}
		}
		
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master!!");
		} else if(checkId(current[0], inputId)) {
			System.out.println("Wrong Id");
		} else {
			System.out.println("Wrong Password");
		}
		
	}
		
		
		
	

	public static boolean checkId(String current,String inputId)
	{
		if((current).equals(inputId)){
			return true;
			}
		else{
			return false;
			}
	
	}
	public static boolean checkPass(String current,String inputPass)
	{
		if((current).equals(inputPass)){
			return true;
			}
		else{
			return false;
			}
	
	}
}
	
	



