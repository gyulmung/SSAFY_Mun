import java.io.*;

public class Main {

    public static int gcd(int p, int q)
        {
            if (q == 0) return p;
            return gcd(q, p%q);
        }


    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int ret = gcd(a, b);
        System.out.print(ret);
    }
}