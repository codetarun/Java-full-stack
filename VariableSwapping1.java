import java.util.Scanner;

public class VariableSwapping1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int input;
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        n1 = n1 * n2;
        n2 = n1 / n2;
        n1 = n2 / n1;
        System.out.println(n1);
        System.out.println(n2);
        sc.close();
    }

}