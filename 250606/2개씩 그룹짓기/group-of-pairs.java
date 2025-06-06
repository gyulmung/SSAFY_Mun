import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 원소의 개수 / 2
		int N = Integer.parseInt(br.readLine());
		// 배열 받기
		String[] strArr = br.readLine().split(" ");
		int[] numArr = new int[2*N];
		for(int i = 0; i < 2*N; i++) {
			numArr[i] = Integer.parseInt(strArr[i]);
		}
		
		// 배열 오름차순 정렬
		Arrays.sort(numArr);
		
		// 배열의 양 끝을 더하고 최대값 찾기
		int Max = 0;
		for(int i = 0; i < N; i++) {
			if(numArr[i] + numArr[2*N-(1+i)] > Max) {
				Max = numArr[i] + numArr[2*N-(1+i)]; 
			}
		}
		
		System.out.print(Max);
	}

}