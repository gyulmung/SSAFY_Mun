import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        for(int i = N; i > 0; i/=M){
            
            System.out.println(i);
        }
        // Please write your code here.
    }
}
