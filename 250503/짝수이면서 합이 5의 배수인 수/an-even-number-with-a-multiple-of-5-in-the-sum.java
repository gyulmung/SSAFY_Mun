import java.io.*;
public class Main {

    public static void func(int a){
        int tenUpper = a/10;
        int tenDown = a%10;
        if ((tenDown+tenUpper)%5==0){
            System.out.printf("Yes");
        }
        else{
            System.out.printf("No");
        }

    }



    public static void main(String[] args)throws IOException {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        func(a);

    }
}