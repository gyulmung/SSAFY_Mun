import java.io.*;

public class Main {
	
	//각 자리수의 합 구하는 함수
	public static int Func(int N) {
		if(N == 0) return N;
		return (N%10)+Func(N/10);
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int a1 = Integer.parseInt(arr[0]);
		int a2 = Integer.parseInt(arr[1]);
		int a3 = Integer.parseInt(arr[2]);
		int num = a1 * a2 * a3;
		int res = Func(num);
		System.out.print(res);
	}

}
