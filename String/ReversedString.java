import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String original= sc.nextLine();

        String reversed = "";

        for (int i=original.length()-1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        System.out.println(reversed);

    }
}