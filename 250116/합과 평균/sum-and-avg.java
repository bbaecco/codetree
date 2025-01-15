import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int hap = a + b;
        
        System.out.printf("%d %.1f", hap, (double)hap/2);
    }
}