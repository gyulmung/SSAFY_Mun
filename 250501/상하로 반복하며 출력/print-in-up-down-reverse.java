import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        for(int i = 0; i < N ; i++){
            if(i%2==0){
                for(int j = 1; j <= N ; j++ ){
                    arr[j-1][i] = j;
                }
            }
            else{
                for(int j = N; j >= 1; j--){
                    arr[N-j][i] = j;
                }
            }
        }
        for(int i = 0; i < N ; i++){
            for(int j = 0 ; j < N; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}