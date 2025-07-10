import java.util.Scanner;

public class EvenOddCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 6 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nEven numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
