import java.util.Scanner;

class vetv4 {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        int a = dt.nextInt();
        int b = dt.nextInt();
        int x = dt.nextInt();
        int y = dt.nextInt();
        int z = dt.nextInt();
        if (a == x && b == y || a == x && b == z || a == y && b == x || a == y && b == z || a == z && b == y || a == z && b == x)
            System.out.println("Кирпич пройдет через отверстие");
        else
            System.out.println("Кирпич не пройдет через отверстие");
    }
}