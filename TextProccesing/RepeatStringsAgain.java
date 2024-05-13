package TextProccesing;

import java.util.Scanner;

public class RepeatStringsAgain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String [] inputArr = scanner.nextLine().split(" ");

        for (String element : inputArr) {
            int sizeElement = element.length();
            System.out.print(element.repeat(sizeElement));
        }
    }
}
