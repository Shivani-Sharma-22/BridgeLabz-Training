imort java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a string to reverse: ");
       String input = scanner.nextLine();
       StringBuilder sb = new StringBuilder();
       sb.append(input);
       sb.reverse();
       String reversedString = sb.toString()
       System.out.println("Reversed string: " + reversedString);
       
}