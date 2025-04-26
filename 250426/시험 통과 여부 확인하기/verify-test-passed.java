import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if(a >= 80){
            System.out.printf("pass");
        }
        else{
            System.out.printf("%d more score", 80-a);
        }

    }
}