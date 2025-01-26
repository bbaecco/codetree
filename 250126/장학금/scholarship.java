import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();  //중간
        int fin = sc.nextInt();  //기말

        if (mid < 90 || fin < 90) {
            System.out.println(0);
        } else if (fin >= 95) {
            System.out.println(100000);
        } else {
            System.out.println(50000);
        }
    }
}