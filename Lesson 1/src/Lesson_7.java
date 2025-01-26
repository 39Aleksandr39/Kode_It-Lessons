import java.util.Random;

public class Lesson_7 {
    public static void main(String[] args) {

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 10;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        
        int[] people = new int[6];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Random().nextInt(100);
        }
        int summ = 0;
        for (int i = 0; i < people.length; i++) {
            summ += people[i];
        }

        System.out.println("Средний возраст: " + summ / people.length);
    }
}
