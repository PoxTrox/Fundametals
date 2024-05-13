package TextProccesing;

import java.util.Scanner;

public class ReverseStrings {


    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String command = scanner.nextLine();


        while (!command.equals("end")){

            StringBuilder  sb = new StringBuilder(command);
            sb.reverse();
            System.out.println(command + " = "+ sb);

            command = scanner.nextLine();
        }
    }
}
