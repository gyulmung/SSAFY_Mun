import java.io.*;
public class Main {
	public static Integer Func(String Alpha) {
		int count = 0;
		int len = Alpha.length();
		for(int i = 0; i<len-1; i++) {
			if(count>=1) break;
			for(int j = i+1; j<len;j++) {
				if(Alpha.charAt(i) != Alpha.charAt(j)) {
					count += 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		int result = Func(A);
		if(result>=1) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
		
	}
}