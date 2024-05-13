package TextProccesing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String[] banedWord = scanner.nextLine().split(", ");
        String input = scanner.nextLine();

        for (String elements : banedWord) {

            int sizeBanWord = elements.length();
             input = input.replace(elements,"*".repeat(sizeBanWord));
        }
        System.out.println(input);

    }
}
