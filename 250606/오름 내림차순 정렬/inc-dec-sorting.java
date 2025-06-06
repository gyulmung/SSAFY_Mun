import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] numArr = new int[N];
		for(int i = 0; i<N; i++) {
			numArr[i] = Integer.parseInt(strArr[i]);
		}
		
		Arrays.sort(numArr);
		for(int i = 0; i<N; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		Integer[] arr2 = Arrays.stream(numArr).boxed().toArray(Integer[]::new);
		Arrays.sort(arr2, Collections.reverseOrder());
		for(int i = 0; i<N; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}