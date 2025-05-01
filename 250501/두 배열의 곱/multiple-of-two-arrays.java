import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];

        for(int i = 0 ; i < 3; i++){
            String[] lst = br.readLine().split(" ");
            for(int j = 0 ; j<3 ; j++){
                arr1[i][j] = Integer.parseInt(lst[j]);
            }
        }
        String lst1 = br.readLine();
        for(int i = 0 ; i < 3; i++){
            String[] lst = br.readLine().split(" ");
            for(int j = 0 ; j<3 ; j++){
                arr2[i][j] = Integer.parseInt(lst[j]);
            }
        }
        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.printf("%d ", arr1[i][j]*arr2[i][j]);
            }
            System.out.println();
        }
    }
}