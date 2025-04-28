import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i <= a; i++){
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                continue;
            }
            count += 1;
        }
        System.out.print(count);

    }
}