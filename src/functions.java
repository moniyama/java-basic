import java.util.Scanner;

public class functions {
    public static Scanner scanner = new Scanner(System.in); // receiver input

    public static void main(String[] args) {
        System.out.println("input: ");
        String name = scanner.next();
        int numb = scanner.nextInt();

        System.out.println("input: " + name + numb);

        hello("John", 12);

        // arrays
        int[] numbers = {2, 4, 5, 1};

        for (int banana : numbers) {  // for of
            System.out.println("banana = " + banana);
            System.out.println(numbers[0]); // normal
        }
        // define array size
        int[] numberArr = new int[5]; // tem 5 elementos
        numberArr[0] = 1;
        numberArr[1] = 10;
        numberArr[2] = 12;
        numberArr[3] = 13;
        numberArr[4] = 13;
//        numberArr[5] = 13; // out of bounds
        System.out.println("numberArr = " + numberArr[0]);
    }

    public static void hello(String name, int age) {
        System.out.println("name = " + name + age);
    }
}
