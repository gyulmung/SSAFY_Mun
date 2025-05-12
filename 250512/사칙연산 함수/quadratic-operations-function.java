import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        char b = arr[1].charAt(0);
        int c = Integer.parseInt(arr[2]);
        // Please write your code here.

        if (b == '+'){
            System.out.printf("%d + %d = %d",a, c, a+c);
        }
        else if (b == '-'){
            System.out.printf("%d - %d = %d",a, c, a-c);
        }
        else if (b == '*'){
            System.out.printf("%d * %d = %d",a, c, a*c);
        }
        else if(b == '/'){
            System.out.printf("%d / %d = %d",a, c, a/c);
        }
        else{
            System.out.printf("False");
        }
    }
}