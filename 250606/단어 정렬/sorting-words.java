import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 들어올 문자의 개수
		int N = Integer.parseInt(br.readLine());
		
		// 문자를 리스트로 받아줌
		String[] arr = new String[N];
		for(int i = 0 ; i < N ; i++) {
			String A = br.readLine();
			arr[i] = A;
		}
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < N ; i++) {
			System.out.println(arr[i]);
		}
	}

}
