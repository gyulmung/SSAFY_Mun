import java.io.*;

public class Main {

	public static void Re(int lev, int N) {
		if(lev == N) return;
		System.out.printf("HelloWorld\n");
		Re(lev+1, N);
		return;
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		Re(0, a);

	}

}