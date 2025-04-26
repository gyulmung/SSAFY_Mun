import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        String[][] arr = {{"book", "3000"},{"mask", "1000"}};
        if (a >= 3000){
            System.out.printf("book");
        }
        else if(a<1000){
            System.out.printf("no");
        }
        else{
            System.out.printf("mask");
        }
    }   
}