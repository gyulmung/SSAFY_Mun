import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 문자 받기 -> 배열로 받을 예정
		String[] arr1 = br.readLine().split("");
		String[] arr2 = br.readLine().split("");
		// 오름차순 정렬
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		// 배열의 길이가 같은지 확인하기
		// 같으면 비교, 다르면 No 출력
		int arr1Len = arr1.length;
		int arr2Len = arr2.length;
		
		boolean res = true;
		if(arr1Len == arr2Len) {
			for(int i = 0; i < arr1Len; i++) {
				if(arr1[i].charAt(0) != arr2[i].charAt(0)) {
					res=false;
					break;
				}
			}
		}
		else res = false;
		
		if(res) System.out.print("Yes");
		else System.out.print("No");
	}

}
