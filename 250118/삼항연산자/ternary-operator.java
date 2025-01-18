import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();

        String grade = point == 100 ? "pass" : "failure";

        System.out.print(grade);
    }
}