package TextProccesing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String searchingWord = scanner.nextLine();
        String input = scanner.nextLine();

        int index = input.indexOf(searchingWord);


      while (index !=-1){

         input = input.replace(searchingWord,"");

         index = input.indexOf(searchingWord);
      }
        System.out.println(input);
    }
}
