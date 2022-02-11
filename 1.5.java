import java.util.Scanner;

class five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = ((n / 60) / 60) % 24;
        int m = n / 60 % 60;
        int s = n % 60;
        if (h < 10) System.out.print("0");
        System.out.print(h + "ч:");
        if (m < 10) System.out.print("0");
        System.out.print(m + "мин:");
        if (s < 10) System.out.print("0");
        System.out.println(s + "с");
    }
}