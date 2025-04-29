import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int multiThree = 0;
        int multiFive = 0;
        for(int i = 0; i < 10; i++){
            int a = Integer.parseInt(br.readLine());
            if(a%3==0){
                multiThree += 1;
            }
            if(a%5==0){
                multiFive+=1;
            }
        }
        System.out.printf("%d %d", multiThree, multiFive);
    }
}