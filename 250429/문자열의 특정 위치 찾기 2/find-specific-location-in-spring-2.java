import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String srr = br.readLine();
        int cnt = 0;
        
        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        for(int i = 0; i<5;i++){
            if(arr[i].charAt(2) == srr.charAt(0) || arr[i].charAt(3) == srr.charAt(0)){
                cnt += 1;
                System.out.println(arr[i]);
            }
        }
        System.out.print(cnt);
    }
}