import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        System.out.print("Please enter " + numbers.length + " values:");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        input.close();
        System.out.print("Values is ");
        for (int n : numbers) {
            System.out.print(n + "\t");
        }
    }
}