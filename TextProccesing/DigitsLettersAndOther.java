package TextProccesing;

import java.util.Scanner;

public class DigitsLettersAndOther {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        StringBuilder sbForDigit = new StringBuilder();
        StringBuilder sbForLetters = new StringBuilder();
        StringBuilder sbForOthers = new StringBuilder();

        char [] inputChar = input.toCharArray();

        for (char elements : inputChar) {

            if (Character.isDigit(elements)) {
                sbForDigit.append(elements);
            } else if (Character.isLetter(elements)) {
                sbForLetters.append(elements);
            } else {
                sbForOthers.append(elements);
            }
        }
        System.out.println(sbForDigit);
        System.out.println(sbForLetters);
        System.out.println(sbForOthers);
    }
}
