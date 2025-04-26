import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        // 첫번째
        if(a >= b){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        // 두번째
        if(a > b){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        // 세번째
        if(a <= b){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        // 네번째
        if(a < b){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        // 다섯번째
        if(a == b){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        // 여섯번째
        if(a != b){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}