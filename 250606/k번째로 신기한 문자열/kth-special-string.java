import java.io.*;
import java.util.*;

public class Main {

	// 문자열 T로 시작하는지 확인
	public static boolean Func(String st, String str) {
		for(int i = 0; i<st.length(); i++) {
			if(st.charAt(i) != str.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N, K, 시작문자열 받기
		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1])-1;
		String T = arr[2];
		// 문자열 받기
		// 문자열이 T 로 시작하는지 확인하면서 리스트에 담기
		List<String> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String A = br.readLine();
			if (A.startsWith(T)) {
				list.add(A);
			}
		}

		Collections.sort(list);
		System.out.print(list.get(K));
	}

}