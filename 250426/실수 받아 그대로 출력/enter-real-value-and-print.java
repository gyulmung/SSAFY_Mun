import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr = br.readLine();
        double a = Double.parseDouble(arr);

        System.out.printf("%.2f", a);
    }
}