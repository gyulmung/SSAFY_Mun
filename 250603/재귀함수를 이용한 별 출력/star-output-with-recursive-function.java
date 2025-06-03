import java.io.*;

public class Main {
	public static void Star(int lev, int N) {
		if(lev == N+1) {
			return;
		}
		for(int i = 0; i <lev; i++) {
			System.out.printf("*");
		}
		System.out.println();
		Star(lev+1, N);
		return;
	}
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		Star(1, A);
		

	}

}
