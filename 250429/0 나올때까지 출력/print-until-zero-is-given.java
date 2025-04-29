import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = -1;
        while(num != 0){
            num = Integer.parseInt(br.readLine());
            if(num == 0){
                break;
            }
            System.out.println(num);
        }
    }
}