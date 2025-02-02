import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //홀수 달 
        if (n % 2 != 0) {
            if (n <= 7) {
                System.out.println(31);
            } else {
                System.out.println(30);
            }
        } 
        //짝수 달
        else {
            if (n == 2) {
                System.out.println(28);
            } else if (n <= 6) {
                System.out.println(30);
            } else {
                System.out.println(31);
            }
        }
        
    }
}