import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A의 점수
        int math_a = sc.nextInt();
        int eng_a = sc.nextInt();

        //B의 점수
        int math_b = sc.nextInt();
        int eng_b = sc.nextInt();

        if(math_a > math_b && eng_a > eng_b){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}