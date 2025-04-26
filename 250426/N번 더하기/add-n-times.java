import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int A = Integer.parseInt(arr[0]);
        int N = Integer.parseInt(arr[1]);

        for(int i = 1; i <= N; i ++){
            System.out.println(A+(i*N));
        }
    }
}