import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[3][3];
        for (int i = 0; i < 3; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = line[j];
            }
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.printf("%d ",Integer.parseInt(arr[i][j])*3);

            }
            System.out.println();
        }
    }
}