import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m1 = sc.next();
        int m1_c = sc.nextInt();
        String m2 = sc.next();
        int m2_c = sc.nextInt();
        String m3 = sc.next();
        int m3_c = sc.nextInt();

        int cnt = 0;

        if (m1.equals("Y") && m1_c >= 37) cnt += 1;
        if (m2.equals("Y") && m2_c >= 37) cnt += 1;
        if (m3.equals("Y") && m3_c >= 37) cnt += 1;

        if (cnt >= 2)
            System.out.println("E");
        else 
            System.out.println("N");
    }
}