import java.io.*;
public class Main {

    public static int func(int a, int b) {
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            // 3의 배수 검사
            if (i % 3 == 0) {
                cnt++;
                continue;
            }

            // 숫자에 3, 6, 9가 포함되어 있는지 검사
            String s = Integer.toString(i);
            if (s.contains("3") || s.contains("6") || s.contains("9")) {
                cnt++;
            }
        }

        return cnt;
    }



    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int ret = func(a, b);
        System.out.print(ret);

    }
}