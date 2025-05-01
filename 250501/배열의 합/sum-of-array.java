import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i <4;i++){
            int total = 0;
            String[] lst = br.readLine().split(" ");
            for(int j =0 ; j<4;j++){
                total += Integer.parseInt(lst[j]);
            } 
            System.out.println(total);
        }
    }
}