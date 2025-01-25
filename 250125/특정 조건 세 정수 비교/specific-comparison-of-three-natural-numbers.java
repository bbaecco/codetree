import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = 0;
        //최솟값 구하기
        if (a <= b && a < c) {
            min = a;
        } else if (b <= a && b < c) {
            min = b;
        } else if (c <= a && c < b) {
            min = c;
        } 

        if (a == min) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }

        if (a == b && b == c) {  //세 수가 모두 같은 경우
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}