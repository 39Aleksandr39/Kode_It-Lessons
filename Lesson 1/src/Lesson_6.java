import javax.xml.transform.Source;
import java.util.Scanner;
import java.util.SortedMap;

public class Lesson_6 {
    public static void main(String[] args) {


//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello");
//        }
        boolean isContinue = true;
//        while (isContinue) {
//            System.out.println("Hello");
//            System.out.println("Continue? (1/0)");
//            int input = new Scanner(System.in).nextInt();
//            if (input == 0) {
//                isContinue = false;
//            }
//        }

//        do {
//            System.out.println("Hello");
//            System.out.println("Continue? (1/0)");
//            int input = new Scanner(System.in).nextInt();
//            if (input == 0) {
//                isContinue = false;
//            }
//        } while (isContinue);

        int x = 0;
        int y = 0;

        while (isContinue) {
            System.out.println("Выберите куда двинутся:\n1 - вверх\n2 - вниз\n3 - вправо\n4 - влево\n0 - завершить программу");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                y++;
            } else if (input == 2) {
                y--;
            } else if (input == 3) {
                x++;
            } else if (input == 4) {
                x--;
            } else if (input == 0) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.println("Error");
                isContinue = false;
            }
            System.out.println("Координаты робота: по вертикали: " + y + " по горизонтали: " + x);
        }
    }
}
