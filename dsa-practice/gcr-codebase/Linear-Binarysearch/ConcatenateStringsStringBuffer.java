import java.util.Scanner;

public class ConcatenateStringsStringBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        String result = concatenateStrings(strings);
        System.out.println(result);
        scanner.close();
    }

    public static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }
}
