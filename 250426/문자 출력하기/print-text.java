import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        for(int i = 0; i<8;i++){
            System.out.print(a);
        }
    }
}