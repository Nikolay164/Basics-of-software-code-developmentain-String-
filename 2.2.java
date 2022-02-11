import java.util.Scanner;

class vetv2 {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        int a = dt.nextInt();
        int b = dt.nextInt();
        int c = dt.nextInt();
        int d = dt.nextInt();
        int x = Math.min(a, b);
        int y = Math.min(c, d);
        System.out.println(Math.max(x, y));
    }
}