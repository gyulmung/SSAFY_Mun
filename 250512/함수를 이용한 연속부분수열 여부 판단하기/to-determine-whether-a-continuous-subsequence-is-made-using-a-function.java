import java.io.*;
public class Main {

    public static boolean isNum(int[] Arr, int[] Brr, int a){
        for(int i = 0; i < Brr.length;i++){
            if(a+i >= Arr.length){
                return false;
            }
            if(Arr[a+i] != Brr[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int[] arrA = new int[a];
        int[] arrB = new int[b];
        String[] lstA = br.readLine().split(" ");
        for(int i  = 0; i < a; i++){
            arrA[i] = Integer.parseInt(lstA[i]);
        }
        String[] lstB = br.readLine().split(" ");
        for(int i  = 0; i < b; i++){
            arrB[i] = Integer.parseInt(lstB[i]);
        }

        boolean found = false;

        for (int i = 0; i <= a - b; i++) {
            if (arrA[i] == arrB[0] && isNum(arrA, arrB, i)) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Yes" : "No");
    }
}