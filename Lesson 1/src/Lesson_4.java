import java.util.Scanner;

public class Lesson_4 {
    public static void main(String[] args) {
       /*
                    План урока
        1. Что такое переменная
        2. Для чего нужна переменная
        3. Хранение переменных в Java
        4. Примитивные типы данных
        5. Максимальные и минимальные типы данных
        6. Переполнение переменных
        7. Ввод данных с консоли
        8. Практика (Исправления BMI, калькулятор умножения)
        */
//        System.out.println("Введите свой вес в(кг):");
//        double weight =  new Scanner(System.in).nextDouble();
//        System.out.println("Введите свой рост(м):");
//        double height = new Scanner(System.in).nextDouble();
//
//        System.out.println("BMI = " + weight / (height * height));

        System.out.println("\t\t***Добро пожаловать в калькулятор умножения чисел!***\n\n");
        System.out.println("Введите число:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int b = new Scanner(System.in).nextInt();

        System.out.println(a + " * " + b + " = " + a * b);

    }
}
