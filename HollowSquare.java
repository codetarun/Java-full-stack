import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        System.out.println("Enter a limit");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == 1 || j == num || i == 1 || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        sc.close();
    }
}