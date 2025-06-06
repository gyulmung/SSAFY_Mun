import java.io.*;

public class Main{

	public static int Func(int N) {
		if(N==1) return 1;
		if(N==2) return 2;
		return Func(N/3) + Func(N-1);
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int res = Func(A);
		System.out.print(res);

	}

}
