import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(a);
        if(a < 0){
            System.out.printf("minus");
        }

    }
}