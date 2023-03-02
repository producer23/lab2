import java.util.Scanner;

public class Calc {

    public static double func(double x, double y) {
        return (3.0 * Math.pow(Math.cos(x - Math.PI / 6.0), 2)) / (0.5 + Math.sin(y * y));
    }

    public static void main(String[] args) {
        if (args.length > 0 && !args[0].isEmpty()) {
            System.out.println("Hello, " + args[0]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите X и Y:");
        func(sc.nextDouble(), sc.nextDouble());
    }
}
