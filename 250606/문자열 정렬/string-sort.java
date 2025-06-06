import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] A = br.readLine().split("");
		
		// 알파벳 순서대로 정렬
		Arrays.sort(A);
		
		for(int i = 0; i<A.length;i++) {
			System.out.print(A[i]);
		}
	}

}
