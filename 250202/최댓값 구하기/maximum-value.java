import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b) {
            if (a >= c) 
                System.out.println(a);
            else if (c >= a)
                System.out.println(c);
        }
        else if (b >= a) {
            if (b >= c)
                System.out.println(b);
            else if (c >= b)
                System.out.println(c);
        }
        else if (c >= a) {
            if (c >= b) 
                System.out.println(c);
            else if (b >= c)
                System.out.println(b);
        }
    }
}