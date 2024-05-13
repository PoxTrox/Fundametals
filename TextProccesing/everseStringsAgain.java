package TextProccesing;

import java.util.Scanner;

public class reverseStringsAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("end")){

            String input = inputCommand;
            StringBuilder sb = new StringBuilder(input);

            sb.reverse();
            System.out.println(inputCommand + " = " + sb);

            inputCommand = scanner.nextLine();
        }
    }
}
