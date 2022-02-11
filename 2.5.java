import java.util.Scanner;

class vetv5 {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        Double x = dt.nextDouble();

        if (x > 3)
            System.out.println(1 / (x * x * x + 6));
        else
            System.out.println(x * x - 3 * x + 9);
    }
}