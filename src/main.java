import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap c: ");
        int c = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.calculation();
    }
}
