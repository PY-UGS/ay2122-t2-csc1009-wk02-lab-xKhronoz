import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter 3 numbers: ");
            String num_str = input.nextLine();
            // System.out.println(num_str);
            String[] num_list = num_str.trim().split(" ");
            String[] num_list_s = new String[3];

            if (num_list.length < 3) {
                num_list_s[0] = num_list[0];
                num_list_s[1] = input.nextLine();
                num_list_s[2] = input.nextLine();
            }

            else {
                num_list_s = num_list;
            }

            float avg = 0;

            for (int i = 0; i < 3; i++) {
                avg += Float.parseFloat(num_list_s[i]);

            }

            avg /= 3.0;

            System.out.printf("The average for %s %s %s is %f", num_list_s[0], num_list_s[1], num_list_s[2], avg);
        }
    }
}
