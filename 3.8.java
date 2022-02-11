import java.util.Scanner;

class Cycle8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] charArrayA = Integer.toString(a).toCharArray();
        char[] charArrayB = Integer.toString(b).toCharArray();
        int[] arrayA = new int[charArrayA.length];
        int[] arrayB = new int[charArrayB.length];
        System.out.print("Первое число состоит из следующих цифр: ");
        for (int i = 0; i < charArrayA.length; i++) {
            arrayA[i] = Character.getNumericValue(charArrayA[i]);
            System.out.print(arrayA[i] + " ");
        }
        System.out.print("\nВторое число состоит из следующих цифр:");
        for (int j = 0; j < charArrayB.length; j++) {
            arrayB[j] = Character.getNumericValue(charArrayB[j]);
            System.out.print(arrayB[j] + " ");
        }
    }
}