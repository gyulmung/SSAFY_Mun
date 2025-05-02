import  java.io.*;

public class Main {

    public static void inputNum(){
        System.out.printf("12345^&*()_");
    }

    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i < a; i++){
            inputNum();
            System.out.println();
        }
    }
}