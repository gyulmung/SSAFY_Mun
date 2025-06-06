import java.io.*;

public class Main {
	
	public static int Func(int num, int cnt) {
		if(num==1) return cnt ;
		if(num%2 == 0) {
			return Func(num/2, cnt+1);
		}
		else {
			return Func(num*3+1, cnt+1);
		}
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int res = Func(A, 0);
		System.out.print(res);

	}

}
