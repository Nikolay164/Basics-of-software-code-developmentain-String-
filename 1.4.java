import java.util.Scanner;

class four {
    public static void main(String[]
                                    args) {
        Scanner sc = new
                Scanner(System.in);
        double z;
        double x = sc.nextDouble();
        sc.close();
        double n = (int) x;
        z = n / 1000 + (x - n) * 1000;

        System.out.printf("%.3f", z);
    }
}