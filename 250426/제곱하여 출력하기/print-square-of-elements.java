import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        for(int i = 0; i < arr.length; i++){
            int a = Integer.parseInt(arr[i]);
            System.out.printf("%d ",(int)Math.pow(a, 2));
        }
    }
}