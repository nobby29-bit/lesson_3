package ru.geekbrains;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameGuessTheWord {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static Scanner scannerAnswer = new Scanner(System.in);

    public static void main(String[] args){

        String Answer = "yes";

        char[] mask = {'#', '#', '#','#','#','#','#','#','#','#','#','#','#','#','#'};

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        int index = random.nextInt(words.length);
        System.out.println("Индекс загаданного слова: "+index);
            while (Answer.equals("yes") ) {
        System.out.println("Enter a word >>>");
        String word = scanner.next();

            if (word.equals(words[index - 1])) {
                System.out.println("Your win!!!");
                break;
            } else {
for (int i=0; i<=words[index - 1].length()-1; i++){
    if (i<=word.length()-1) {
        char a = words[index - 1].charAt(i);
        char b = word.charAt(i);
        if (a == b) {
            mask[i] = a;
        }
    }

}

            }
                System.out.println(Arrays.toString(mask));
            System.out.println("continue?");

                Answer = scannerAnswer.next();
        }
    }
}
