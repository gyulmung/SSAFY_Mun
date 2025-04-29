import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int num = a;
        while(true){
            System.out.printf("%d ", num);
            if(num % 2 == 0){
                num += 3;
            }
            else if(num % 2 == 1){
                num *= 2;
            }
            if(num > b){
                break;
            }

        }
    }
}