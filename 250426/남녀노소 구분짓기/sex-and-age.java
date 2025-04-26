import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int gender = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());

        if(age>=19){
            if (gender == 0){
                System.out.print("MAN");
            }
            else{
                System.out.print("WOMAN");
            }
        }
        else{
            if(gender == 0){
                System.out.print("BOY");
            }
            else{
                System.out.print("GIRL");
            }
        }

    }
}