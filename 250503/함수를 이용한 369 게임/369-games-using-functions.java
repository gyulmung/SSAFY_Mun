import java.io.*;
public class Main {

    public static int func(int a, int b){
        int cnt = 0;
        for(int i = a ; i <= b ; i++ ){
            if (i % 3 == 0 || i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i / 10 == 3 || i / 10 == 6 | i / 10 == 9){
                cnt += 1;
            }
        }
        return cnt;
    }



    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int ret = func(a, b);
        System.out.print(ret);

    }
}