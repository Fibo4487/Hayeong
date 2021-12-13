import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastAplusB {
	public static void main(String[] args) throws IOException {
		InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int i = Integer.parseInt(br.readLine());
		
		for (int a = 0; a < i; a++) {
			st = new StringTokenizer(br.readLine());
			
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
