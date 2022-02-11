import java.util.Scanner;

class Cycle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 0;
        int d = 0;
        while (x < a) {
            x = x + 1;
            d = d + x;
        }

        System.out.println(d);
    }
}