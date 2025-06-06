import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[] strArr = br.readLine().split(" ");
		int[] numArr = new int[N];
		
		for (int i = 0; i < N; i++) {
			numArr[i] = Integer.parseInt(strArr[i]);

			if (i % 2 == 0) {
				// 지금까지 입력된 값만 복사해서 정렬
				int[] temp = Arrays.copyOf(numArr, i + 1);
				Arrays.sort(temp);
				System.out.print(temp[i / 2] + " ");
			}
		}
	}
}