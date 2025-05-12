import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        // Please write your code here.
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        if(a==1||a==3||a==5||a==7||a==8||a==10||a==12){
            if(b>=1 && b<=31){
                System.out.printf("Yes");
            }
            else{
            System.out.printf("No");
            }
        }
        else if(a==4||a==6||a==9||a==11){
            if(b>=1 && b<=30){
                System.out.printf("Yes");
            }
            else{
            System.out.printf("No");
            }
        }
        else if(a==2){
            if(b>=1 && b<=28){
                System.out.printf("Yes");
            }
            else{
            System.out.printf("No");
            }
        }
        else{
            System.out.printf("No");
        }
    }
}