import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Check {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String word1 = in.nextLine();
        System.out.print("Enter the second string: ");
        String word2 = in.nextLine();

        if (isAnagram(word1, word2)) {
            System.out.println("Yes, they are Anagrams.");
        } else {
            System.out.println("No, they are not Anagrams.");
        }
    }
    public static boolean isAnagram(String str1, String str2) {

            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            if (str1.length() != str2.length()) {
                return false;
            }

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
    }
}
