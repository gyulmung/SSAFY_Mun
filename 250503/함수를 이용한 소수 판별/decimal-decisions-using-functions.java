import java.io.*;
import java.util.*;

public class Main {
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;  // 0과 1은 소수가 아님

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    // a부터 b까지의 소수의 합 구하기
    public static int sumOfPrimesInRange(int a, int b) {
        boolean[] isPrime = sieveOfEratosthenes(b); // 1부터 b까지의 소수 구하기
        int sum = 0;

        // a 이상 b 이하의 소수들 합 구하기
        for (int i = a; i <= b; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }

        return sum;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int ret =sumOfPrimesInRange(a, b);
        System.out.print(ret);
    }
}