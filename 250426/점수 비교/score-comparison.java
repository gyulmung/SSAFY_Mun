import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");
        int A_en = Integer.parseInt(arr1[0]);
        int A_ma = Integer.parseInt(arr1[1]);
        int B_en = Integer.parseInt(arr2[0]);
        int B_ma = Integer.parseInt(arr2[1]);

        if(A_en>B_en && A_ma>B_ma){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}