import java.io.*;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.abs;

class Cycle5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double e = sc.nextDouble();
        double sum = 0;
        double n = 100;

        for (int i = 0; i < n; i++) {
            double a = (1 / (pow(2, i))) + (1 / (pow(3, i)));
            if (abs(a) >= e) {
                sum += a;
                n++;
            }
        }
        System.out.println(sum);
    }
}
