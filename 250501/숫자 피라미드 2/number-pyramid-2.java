import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i;j++){
                cnt+=1;
                System.out.printf("%d ", cnt);
            }
            System.out.println();
        }
    }
}