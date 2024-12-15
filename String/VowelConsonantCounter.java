import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        input = input.toLowerCase();

        for (int i=0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
                vowelCount ++;
            } else {
                consonantCount ++;
            }
        }

        System.out.println("Vowel:" + vowelCount);
        System.out.println("Consonant:" + consonantCount);

        sc.close();
    }
}
