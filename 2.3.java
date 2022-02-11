import java.util.Scanner;

class vetv3 {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        int x1 = dt.nextInt();
        int y1 = dt.nextInt();
        int x2 = dt.nextInt();
        int y2 = dt.nextInt();
        int x3 = dt.nextInt();
        int y3 = dt.nextInt();
        if (x1 == x2 && x1 == x3 && x2 == x3 || y1 == y2 && y1 == y3 && y2 == y3)
            System.out.println("Точки А,B,С расположены на одной прямой");
        else
            System.out.println("Точки А,B,С не расположены на одной прямой");
    }
}