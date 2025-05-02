import java.io.*;
public class Main {

    public static void Sample(int Alpha){
        int cnt = 0;
        for(int i = 0; i < Alpha; i++){
            for(int j =0; j < Alpha; j++){
                cnt++;
                System.out.printf("%d ", cnt);
                if(cnt == 9){
                    cnt = 0;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Sample(a);
    }
}