import java.io.*;

public class Main {
	
	public static void Num(int N) {
		if(N==0) return;
		System.out.print(N + " ");
		Num(N-1);
		System.out.print(N + " ");
		return;
	}
	

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		Num(A);
		

	}

}
