package TextProccesing;

import java.util.Scanner;

public class SubstringAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String firstInput = scanner.nextLine();
        String lastInput = scanner.nextLine();

        int index = lastInput.indexOf(firstInput);

        while (index >-1){

            lastInput = lastInput.replace(firstInput,"");
            index = lastInput.indexOf(firstInput);
        }
        System.out.println(lastInput);
    }
}
