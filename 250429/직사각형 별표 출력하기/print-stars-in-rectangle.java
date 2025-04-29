import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        for(int i = 0;i<N;i++){
            for(int j = 0; j < M; j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}