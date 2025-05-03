import java.io.*;
public class Main {

    public static int Func(int num){
        int cnt = 0;
        for(int i = 0; i <= num ; i++){
            cnt += i;
        }
        return cnt / 10;
    }


    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int ret = Func(a);
        System.out.print(ret);
    }
}