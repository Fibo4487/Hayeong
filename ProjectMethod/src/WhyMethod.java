
public class WhyMethod {

	public static void main(String[] args) {
		
		 			// 인자, argument("a")
        printTwoTimes("a", "-");
        System.out.println(twoTimes("a", "-"));
        // 100000000
        printTwoTimes("a", "*");
        // 100000000
        printTwoTimes("a", "&");
        printTwoTimes("b", "!");
	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
									//매개변수, parameter(String text)
	public static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
	}
}
