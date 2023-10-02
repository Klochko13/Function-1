import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = kb.nextInt();
        System.out.printf("Факториал числа %d составляет %d\n", n, factorial (n));
        System.out.println("Введите степень числа:");
        int power = kb.nextInt();
        power(n,power);

    }
        public static int factorial (int n){
        int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
        public static void power (int n, int power){
        int result = 1;
            for (int i = 0; i < power; i++) {
                result = result * n;
                }
            System.out.println(result);

        }



}