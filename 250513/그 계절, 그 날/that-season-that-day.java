import java.io.*;
public class Main {

    public static boolean isYun(int Year){
        if(Year%4==0){
            if(Year%100==0){
                if(Year%400==0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isMonth(int a, int b, int c){
        if(a==1||a==3||a==5||a==7||a==8||a==10||a==12){
            if(b>=1 && b<=31){
                return true;
            }
            else{
                return false;
            }
        }
        else if(a==4||a==6||a==9||a==11){
            if(b>=1 && b<=30){
                return true;
            }
            else{
                return false;
            }
        }
        else if(a==2&&c==0){
            if(b>=1 && b<=29){
                return true;
            }
            else{
                return false;
            }
        }
        else if(a==2 && c==1){
            if(b>=1 && b<=28){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int Y = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int D = Integer.parseInt(arr[2]);
        if(isYun(Y)){
            if(isMonth(M, D, 0)){
                if(M>=3&&M<=5){
                    System.out.printf("Spring");
                }
                else if(M>=6&&M<=8){
                    System.out.printf("Summer");
                }
                else if(M>=9&&M<=11){
                    System.out.printf("Fall");
                }
                else if(M==1||M==2||M==12){
                    System.out.printf("Winter");
                }
            }
            else{
                System.out.print(-1);
            }
        }
        else{
            if(isMonth(M,D,1)){
                if(M>=3&&M<=5){
                    System.out.printf("Spring");
                }
                else if(M>=6&&M<=8){
                    System.out.printf("Summer");
                }
                else if(M>=9&&M<=11){
                    System.out.printf("Fall");
                }
                else if(M==1||M==2||M==12){
                    System.out.printf("Winter");
                }
            }
            else{
                System.out.print(-1);
            }
        }
        
    }
}