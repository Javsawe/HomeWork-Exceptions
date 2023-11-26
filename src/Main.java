import HomeWorkExceptions.NegativeNumberException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int userInput = getUserInput();
            processInput(userInput);
        } catch (NegativeNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int getUserInput() {
        System.out.print("Введите целое число: ");
        int input = new Scanner(System.in).nextInt();
        return input;
    }

    public static void processInput(int value) throws NegativeNumberException {
        if (value < 0) {
            throw new NegativeNumberException("Введено отрицательное число:");
        } else {
            System.out.println("Ваше число: " + value);
        }
    }
}