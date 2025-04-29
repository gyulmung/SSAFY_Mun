import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i <N; i++){
            for(int j = 0; j <(2*i)+1;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}