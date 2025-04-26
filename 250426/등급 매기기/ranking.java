import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a >= 90){
            System.out.printf("A");
        }

        else if (a >= 80){
            System.out.printf("B");
        }

        else if (a >= 70){
            System.out.printf("C");
        }

        else if (a >= 60){
            System.out.printf("D");
        }
        
        else{
            System.out.printf("F");
        }

    }
}