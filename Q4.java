import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            String[] zodiacs = { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
                    "horse", "sheep" };

            System.out.print("Enter a year: ");
            int year = input.nextInt();
            System.out.println(zodiacs[year % 12]);
        }
    }
}
