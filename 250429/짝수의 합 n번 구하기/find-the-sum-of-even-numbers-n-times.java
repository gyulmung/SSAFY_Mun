import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N ; i++){
            int sum = 0;
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            for(int j = a; j<=b; j++){
                if(j%2==0){
                    sum += j;
                }
            }
            System.out.println(sum);

        }
    }
}