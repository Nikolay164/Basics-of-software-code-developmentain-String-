import java.util.Scanner;

class One {
    public static void main(String[]
                                    args) {
        Scanner sc = new
                Scanner(System.in);
        int z;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        z = ((a - 3) * b / 2) + c;
        System.out.print(z);
    }
}