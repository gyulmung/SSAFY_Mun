import java.io.*;

public class Main {
    // 최대공약수 구하기 (유클리드 호제법)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수 구하기
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
	
	// 최소공배수 계산하기
    public static int Func(int lev, int[] numArr) {
    	if(numArr.length == lev) return numArr[lev-1];
    	int a = numArr[lev-1];
    	int b = numArr[lev];
    	int res = lcm(a, b);
    	numArr[lev] = res;
    	return Func(lev+1, numArr);
    }
    
    
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] numArr = new int[A];
		for(int i=0; i<A; i++) {
			numArr[i] = Integer.parseInt(strArr[i]);
		}
		int result = Func(1, numArr);
		System.out.print(result);
		

	}

}