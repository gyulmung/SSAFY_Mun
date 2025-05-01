import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        int[][] lst1 = new int[N][M];
        int[][] lst2 = new int[N][M];

        for(int i = 0; i<N; i++){
            String[] lst = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                lst1[i][j] = Integer.parseInt(lst[j]);
            }
        }

        for(int i = 0; i<N; i++){
            String[] lst = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                lst2[i][j] = Integer.parseInt(lst[j]);
            }
        }

        for(int i = 0; i < N ; i++){
            for(int j = 0; j<M; j++){
                if(lst1[i][j]==lst2[i][j]){
                    System.out.printf("%d ",0);

                }
                else{
                    System.out.printf("%d ", 1);
                }
                
            }
            System.out.println();
        }
    }
}