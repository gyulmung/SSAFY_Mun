import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if(a < b){
            System.out.printf("%d ", 1);
        }
        else{
            System.out.printf("%d ", 0);
        }
        
        if(a == b){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}