package TextProccesing;

import java.util.Scanner;

public class DigitsLettersAndOtherAgain {

    public static void main(String[] args) {

       Scanner scanner = new Scanner (System.in);

       String input = scanner.nextLine();

       char[] charArr = input.toCharArray();
       StringBuilder sbForDigit  = new StringBuilder();
       StringBuilder sbForLetters = new StringBuilder();
       StringBuilder sbForOthers  = new StringBuilder();


        for (char symbols : charArr) {

            if(Character.isDigit(symbols)){
                sbForDigit.append(symbols);
            }else if(Character.isAlphabetic(symbols)){
                sbForLetters.append(symbols);
            }else {
                sbForOthers.append(symbols);
            }
        }
        System.out.println(sbForDigit);
        System.out.println(sbForLetters);
        System.out.println(sbForOthers);
    }

}
