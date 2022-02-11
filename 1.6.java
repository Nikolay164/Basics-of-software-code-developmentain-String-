import java.util.Scanner;

class six {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        int x = dt.nextInt();
        int y = dt.nextInt();
        if (x > -5 && x < 5 && y > -3 && y < 1 || x > -3 && x < 3 && y > -1 && y < 5)
            System.out.println("true");
        else
            System.out.println("false");
    }
}