import java.io.*;

public class Main {

    public static boolean isPrime(int n){
        if (n<2) return false;
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0)return false;
        }
        return true;
    }


    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int start = Integer.parseInt(arr[0]);
        int end = Integer.parseInt(arr[1]);

        int count = 0;
        // 소수의 제곱 형태를 검사
        for (int i = 2; i * i <= end; i++) {
            int square = i * i;
            if (square >= start && isPrime(i)) {
                count++;
            }
        }

        System.out.println(count);

    }
}