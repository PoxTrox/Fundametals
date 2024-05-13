package TextProccesing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String element : input) {
            if (element.length() > 3 && element.length() <= 16) {



            }

        }

    }

}