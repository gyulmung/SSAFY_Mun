import java.io.*;

public class Main {

    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return (a*b) / gcd(a, b);
    }


    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int ret = lcm(a, b);
        System.out.print(ret);
    }   
}