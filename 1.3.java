import java.util.Scanner;

class three {
    public static void main(String[]
                                    args) {
        Scanner sc = new
                Scanner(System.in);
        double z;
        double a;
        double b;
        double c;
        double d;
        double e;
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.close();
        a = Math.sin(x);
        b = Math.cos(x);
        c = Math.sin(y);
        d = Math.cos(y);
        e = Math.tan(x * y);
        z = (a + d) * e / (b - c);
        System.out.print(z);
    }
}