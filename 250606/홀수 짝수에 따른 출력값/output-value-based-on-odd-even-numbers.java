import java.io.*;

public class Main {

	public static int Func(int n) {
		if(n<=2) {
			return n;
		}
		return n + Func(n-2);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int res = Func(A);
		System.out.print(res);
	}

}