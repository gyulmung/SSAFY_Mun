import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 원소개수
		int N = Integer.parseInt(br.readLine());
		
		// A배열
		String[] arrA = br.readLine().split(" ");
		int[] numA = new int[N];
		
		// B배열
		String[] arrB = br.readLine().split(" ");
		int[] numB = new int[N];
		
		for(int i=0; i<N; i++) {
			numA[i] = Integer.parseInt(arrA[i]);
			numB[i] = Integer.parseInt(arrB[i]);
		}
		
		// A배열과 B배열 오름차순 정렬 후 비교
		Arrays.sort(numA);
		Arrays.sort(numB);
		
		boolean res = true;
		for(int i=0; i<N; i++) {
			if(numA[i] != numB[i]) {
				res = false;
			}
		}
		
		if(res) {
			System.out.printf("Yes");
		}
		else {
			System.out.printf("No");
		}
	}

}