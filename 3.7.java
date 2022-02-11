import java.io.*;
import java.util.Scanner;

class Cycle7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count;
        for (int i = m; i <= n; i++) {
            System.out.print("Для числа " + i + " делителями будут:  ");
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    count++;
                }
            }
            if (count == 0) {

                System.out.println("отсутствуют");
            } else {
                System.out.println();
            }
        }
    }
}