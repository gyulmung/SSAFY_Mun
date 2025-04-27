import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        String result = "";

        for (int i = 0; i < a.length(); i++) {
            if (i == 1) {
                result += 'a'; // 두 번째 문자 'a'
            } else if (i == a.length() - 2) {
                result += 'a'; // 마지막 문자 'a'
            } else {
                result += a.charAt(i); // 나머지는 원래 문자 유지
            }
        }

        System.out.print(result);
    }
}