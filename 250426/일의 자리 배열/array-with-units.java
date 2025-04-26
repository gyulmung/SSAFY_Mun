import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int lst[] = new int[10];
        lst[0] = a;
        lst[1] = b;
        for(int i =2;i<10;i++){
            lst[i] = (lst[i-2]+lst[i-1])%10;
        }

        for(int i = 0; i<10; i++){
            System.out.printf("%d ", lst[i]);
        }
    }
}