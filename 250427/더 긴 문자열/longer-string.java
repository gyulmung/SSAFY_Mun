import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String a = arr[0];
        String b = arr[1];
        if(a.length() > b.length()){
            System.out.printf("%s %d", a, a.length());
        }
        else if(a.length() < b.length()){
            System.out.printf("%s %d", b, b.length());
        }
        else{
            System.out.printf("same");
        }
    }
}