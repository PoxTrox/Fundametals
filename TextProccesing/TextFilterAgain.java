package TextProccesing;

import java.util.Scanner;

public class TextFilterAgain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String []badWords = scanner.nextLine().split(", ");
        String inputText = scanner.nextLine();

        for (String elements : badWords) {

            int size = elements.length();
          inputText =  inputText.replace(elements,"*".repeat(size));
        }
        System.out.println(inputText);
    }
}
