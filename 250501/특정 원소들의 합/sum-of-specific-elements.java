import java.io.*;


public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Sum = 0;

        for(int i = 0; i < 4; i++){
            String[] arr = br.readLine().split(" ");
            for(int j = 0 ; j<= i; j++){
                Sum += Integer.parseInt(arr[j]);
            }
        }
        System.out.print(Sum);
    }
}