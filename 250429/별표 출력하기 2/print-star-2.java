import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = N; i>0; i--){
            for(int j = 0; j < i; j++){
                System.out.printf("* ");
            }
            for(int j = 0; j < N - i; j++){
                System.out.printf("");
            }
            System.out.println();
        }
    }
}