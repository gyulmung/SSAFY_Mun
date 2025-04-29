import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int number = 0;

        for(int i = a ; i <= b; i++){
            if(i % 2 == 0){
                number +=i;
            }
        }
        System.out.print(number);
    }
}