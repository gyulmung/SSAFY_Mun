import java.io.*;

public class Main {
	
	public static int A = 0;
	
	public static void Func(int lev, String[] arr) {
		if (lev == arr.length) return;
		if (A < Integer.parseInt(arr[lev])) {
			A = Integer.parseInt(arr[lev]);
		}
		Func(lev+1, arr);
	}
	
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 주어진 원소의 개수
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		Func(0, arr);
		System.out.print(A);
		
	}

}