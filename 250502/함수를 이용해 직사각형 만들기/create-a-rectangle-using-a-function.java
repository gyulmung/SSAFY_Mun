import java.io.*;

public class Main {

    public static void star(int Alpha, int Beta){
        for(int i = 0; i < Alpha; i++){
            for(int j =0 ; j <Beta; j ++){
                System.out.print(1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)throws IOException {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);


        star(a, b);
        br.close();
    }
}