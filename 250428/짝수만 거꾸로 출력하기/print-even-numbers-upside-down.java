import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] numbers = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            numbers[i] = Integer.parseInt(arr[i]);
        }
        for(int i = arr.length-1; i >= 0; i--){
            if(numbers[i]%2 == 0){
                System.out.printf("%d ",numbers[i]);
            }
        }
    }
}