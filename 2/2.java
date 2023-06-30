import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Задача 1:
        //Напишите программу, которая запрашивает у пользователя число и проверяет,
        // является ли оно положительным. Если число отрицательное или равно нулю, программа
        // должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
        // В противном случае, программа должна выводить сообщение "Число корректно".

        Scanner sc = new Scanner(System.in);
        System.out.println("====== Задача № 1 ======");

        try {
            System.out.print("Введите целое число: ");
            int number = sc.nextInt();
            checkNumber(number);
        } catch (InvalidNumberException ex) {
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Некорректный ввод! Вводите целые числа!");
        }
        sc.nextLine();
        System.out.println();
        // Задача 2:
        //Напишите программу, которая запрашивает у пользователя два числа и выполняет
        // их деление. Если второе число равно нулю, программа должна выбрасывать исключение
        // DivisionByZeroException с сообщением "Деление на ноль недопустимо". В противном случае,
        // программа должна выводить результат деления.
        System.out.println("====== Задача № 2 ======");
        try {
            System.out.print("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.print("Введите второе целое число: ");
            int b = sc.nextInt();
            divide(a, b);
        } catch (InputMismatchException e1) {
            System.out.println("Ошибка: некорректный ввод. Вводите целые числа!");
        } catch (DivisionByZeroException e2) {
            System.out.println(e2.getMessage());
        }
        sc.nextLine();
        System.out.println();}

    

    // метод для первой задачи
    public static void checkNumber(int value) throws InvalidNumberException {
        if (value <= 0) {
            throw new InvalidNumberException("Некорректное число!");
        } else {
            System.out.println("Число корректно.");
        }
    }

    // метод для второй задачи
    public static void divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        } else {
            System.out.println(a / b);
        }
    }

    
    }


class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

