import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                System.out.printf("%d * %d = %d", i, j, i*j);
                if (j != N){
                    System.out.printf(", ");
                }
            }
            System.out.println();
        }
    }
}