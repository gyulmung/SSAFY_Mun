import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count = 0;
        int plus = 1;
        while(plus>0){
            count += plus;
            if(count>=a){
                System.out.print(plus);
                break;
            }
            plus++;
        }
    }
}