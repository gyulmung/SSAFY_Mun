import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if((a%2 == 1 && a%3 == 0)||(a%2==0 && a%5==0)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}