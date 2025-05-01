import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0;i<N;i++){
            if(i % 2 == 0){
                for(int j = 1; j <= N; j++){
                    System.out.print(j);
                }
            }
            else{
                for(int j = N; j>=1; j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}