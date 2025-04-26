import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if(a<0){
            System.out.printf("ice");
        }
        else if(a >= 100){
            System.out.printf("vapor");
        }
        else{
            System.out.printf("water");
        }
    }
}