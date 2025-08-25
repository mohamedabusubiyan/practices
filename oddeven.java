import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Zero");
            } else if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

            System.out.println();
		}
	}
}