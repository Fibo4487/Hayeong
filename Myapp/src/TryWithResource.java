import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) {
		// try with resource statements
		try (FileWriter f = new FileWriter("data.txt")) {
			f.write("Hello");
//			f.close(); // AutoCloseable 인터페이스로 인해 필요없어짐
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
