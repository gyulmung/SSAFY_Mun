import java.io.*;
public class Main {

    public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;

    for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0) return false;
    }
    return true;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int cnt = 0;

        for(int i = a; i <= b; i++){
            int ten = i/10;
            int underTen = i % 10;
            if(isPrime(i)){
                if((ten+underTen)%2==0){
                    cnt += 1;
                }
            }
        }
        System.out.print(cnt);
    }
}