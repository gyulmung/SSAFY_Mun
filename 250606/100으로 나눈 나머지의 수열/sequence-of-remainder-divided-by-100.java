import java.io.*;

public class Main{

	// N이 0, 1일때 2, 4가 나올 수 있게 만들고, 재귀를 통해 2이상일 때의 값을 리턴 한다.
	public static int Func(int N) {
		if(N==0) return 2;
		if(N==1) return 4;
		return (Func(N-2) * Func(N-1))%100;
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int res = Func(A-1);
		System.out.print(res);

	}

}
