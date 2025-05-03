import java.io.*;

public class Main {

    public static int Func(int a, int b, int c){
        int ret = Math.min(Math.min(a, b), c);
        return ret;
    }



    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        int ret = Func(a, b, c);
        System.out.print(ret);
    }
}