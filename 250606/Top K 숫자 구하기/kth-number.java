import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//원소의 수 N과 원하는 Idx 받기
		String[] arr1 = br.readLine().split(" ");
		int N = Integer.parseInt(arr1[0]);
		int Idx = Integer.parseInt(arr1[1]);
		
		// 숫자 받아주기
		String[] arr2 = br.readLine().split(" ");
		int[] nums = new int[N];
		for(int i = 0 ; i < N; i++) {
			nums[i] = Integer.parseInt(arr2[i]);
		}
		
		// 오름차순 정렬
		Arrays.sort(nums);
		System.out.print(nums[Idx-1]);
		
		
	}

}