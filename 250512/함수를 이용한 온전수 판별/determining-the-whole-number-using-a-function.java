import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(i%2 != 0){
                if(i%10 != 5){
                    if(i%3!=0 || i%9==0){
                        cnt += 1;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}