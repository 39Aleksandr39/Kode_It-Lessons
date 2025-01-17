import java.util.Scanner;

public class Lesson_5 {
    public static void main(String[] args) {

//        System.out.println("Первая: ");
//        int a = new Scanner(System.in).nextInt();
//
//        System.out.println("Вторая: ");
//        int b = new Scanner(System.in).nextInt();
//
//        if (a > 5 && b < 5) {
//            System.out.println("Hello World");
//        }
//        if (a < 5 && b > 5) {
//            System.out.println("Goodbye World");
//        }
// лог. И &&
// лог. ИЛИ ||

//        System.out.println("Первая: ");
//        int b = new Scanner(System.in).nextInt();
//
//        if (b == 5) {
//            System.out.println("5");
//        } else if (b ==6) {
//            System.out.println("6");
//        } else if (b == 7) {
//            System.out.println("7");
//        } else {
//            System.out.println("N/A");
//        }

        int twixPrice = 77;
        int marsPrice = 78;
        int snickersPrice = 100;
        int waterPrice = 50;

        boolean isCanBuy = false;

        System.out.println("Введите кол-во денег: ");
        int moneyAmount = new Scanner(System.in).nextInt();

        if (moneyAmount >= twixPrice) {
            System.out.println("Вы можете купить твикс!");
            isCanBuy = true;
        }
        if (moneyAmount >= marsPrice) {
            System.out.println("Вы можете купить марс!");
            isCanBuy = true;
        }
        if (moneyAmount >= snickersPrice) {
            System.out.println("Вы можете купить сникерс!");
            isCanBuy = true;
        }
        if (moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить воду!");
            isCanBuy = true;
        }
        if (isCanBuy == false) {
            System.out.println("У вас недостаточно стредств!");
        }
    }
}
