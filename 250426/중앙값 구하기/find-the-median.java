import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        if(a > b && a > c){
            if(b>c){
                System.out.print(b);
            }
            else{
                System.out.print(c);
            }
        }
        else if(b > a && b > c){
            if(a>c){
                System.out.print(a);
            }
            else{
                System.out.print(c);
            }
        }
        else if(c > a && c > b){
            if(b>a){
                System.out.print(b);
            }
            else{
                System.out.print(a);
            }
        }
    }
}