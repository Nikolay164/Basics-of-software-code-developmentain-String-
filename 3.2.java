import java.util.Scanner;

class Cycle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        for (int i = a; i <= b; i = i + h) {
            int numX = i;
            int result;
            if (numX <= 2) {
                result = -numX;
            } else {
                result = numX;
            }
            System.out.println("Значение функции y = " + result + " при x = " + numX);
        }


    }
}