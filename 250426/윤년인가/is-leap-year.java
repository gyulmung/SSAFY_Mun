import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if(a%4==0){
            if(a%100==0 && a%400 != 0){
                System.out.print("false");
            }
            else{
                System.out.print("true");
            }
        }
        else{
            System.out.print("false");
        }

    }
}