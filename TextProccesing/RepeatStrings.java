package TextProccesing;


import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String [] inputArr = scanner.nextLine().split(" ");

        for (String element : inputArr) {

            int size = element.length();
            System.out.print(element.repeat(size));
        }
    }
}
