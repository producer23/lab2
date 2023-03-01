import java.util.Scanner;

public class App {

    public static void func(int var) {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        switch (var) {
            case 1 -> {
                System.out.println("Введите a, b, c, x, n");
                double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), x = sc.nextDouble(), n = sc.nextDouble();
                res = ((5.0 * Math.pow(a, n * x)) / (b + c)) - Math.sqrt(Math.abs(Math.cos(Math.pow(x, 3))));
            }
            case 2 -> {
                System.out.println("Введите a, x, y, e, w");
                double a = sc.nextDouble(), x = sc.nextDouble(), y = sc.nextDouble(), e = sc.nextDouble(), w = sc.nextDouble();
                res = (Math.abs(x - y) / Math.pow(1.0 + 2.0 * x, a)) - Math.pow(e, Math.sqrt(1 + w));
            }
            case 3 -> {
                System.out.println("Введите a0, a1, a2, x");
                double a0 = sc.nextDouble(), a1 = sc.nextDouble(), a2 = sc.nextDouble(), x = sc.nextDouble();
                res = Math.sqrt(a0 + a1 * x + a2 * Math.pow(Math.abs(Math.sin(x)), 1.0 / 3.0));
            }
            case 4 -> {
                System.out.println("Введите a, x");
                double a = sc.nextDouble(), x = sc.nextDouble();
                res = Math.log(Math.abs(Math.pow(a, 7))) + Math.atan(x * x) + (Math.PI / Math.sqrt(Math.abs(a + x)));
            }
            case 5 -> {
                System.out.println("Введите a, b, c, d, e, x");
                double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble(), e = sc.nextDouble(), x = sc.nextDouble();
                res = Math.pow((Math.pow(a + b, 2) / c + d) + Math.pow(e, Math.sqrt(x + 1)), 1.0 / 5.0);
            }
            case 6 -> {
                System.out.println("Введите e, x");
                double e = sc.nextDouble(), x = sc.nextDouble();
                res = Math.pow(e, (2.0 * Math.sin(4.0 * x) + Math.pow(Math.cos(x * x), 2)) / 3.0 * x);
            }
            case 7 -> {
                System.out.println("Введите x");
                double x = sc.nextDouble();
                res = (1.0 / 4.0) * ((1.0 + x * x) / (1.0 - x) + Math.tan(x) / 2.0);
            }
        }
        System.out.println("Результат = " + res);
    }

    public static void main(String[] args) {
        if (args.length > 0 && !args[0].isEmpty()) {
            System.out.println("Hello, " + args[0]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вариант:");
        func(sc.nextInt());
    }
}
