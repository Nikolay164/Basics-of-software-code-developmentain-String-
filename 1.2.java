import java.util.Scanner;

class two {
    public static void main(String[]
                                    args) {
        Scanner sc = new
                Scanner(System.in);
        double z;
        double x;
        double y;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        y = b * b + 4 * a * c;
        x = Math.sqrt(y);
        z = (b + x) / (2 * a) - a * a * a * c + 1 / (b * b);
        System.out.print(z);
    }
}