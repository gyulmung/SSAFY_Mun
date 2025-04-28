import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = num ; num <= 100 ; num++){
            if(num>=90){
                System.out.printf("A ");
            }
            else if(num>=80){
                System.out.printf("B ");
            }
            else if(num>=70){
                System.out.printf("C ");
            }
            else if(num>=60){
                System.out.printf("D ");
            }
            else{
                System.out.printf("F ");
            }
        }
    }
}