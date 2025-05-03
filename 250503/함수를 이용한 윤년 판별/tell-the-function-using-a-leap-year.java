import java.io.*;;

public class Main {

    public static void Year(int a){
        if (a%4 == 0){
            if(a%100 == 0 && a%400 != 0){
                System.out.printf("false");
            }
            else{
            System.out.printf("true");}
        }
        else{
        System.out.printf("false");}
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Year(a);

    }
}