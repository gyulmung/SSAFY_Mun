import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int a = Integer.parseInt(br.readLine());
            if(a<25){
                System.out.printf("Higher\n");
            }
            else if(a>25){
                System.out.printf("Lower\n");
            }
            else{
                System.out.printf("Good\n");
                break;
            }
        }
    }
}