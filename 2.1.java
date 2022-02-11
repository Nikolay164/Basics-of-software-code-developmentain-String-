import java.util.Scanner;

class vetv1 {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        int x = dt.nextInt();
        int y = dt.nextInt();
        int g = x + y;
        if (g < 180)
            System.out.println("Треугольник существует");
        else
            System.out.println("Треугольник не существует");
        if (g == 90 || x == 90 || y == 90)
            System.out.println("Треугольник Прямоугльный");
    }
}