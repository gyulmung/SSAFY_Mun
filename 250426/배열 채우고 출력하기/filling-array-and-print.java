import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}