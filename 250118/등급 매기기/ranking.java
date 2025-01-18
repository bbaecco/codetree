import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        String grade;

        if (point >= 90){
            grade = "A";
        } else if (point >= 80){
            grade = "B";
        } else if (point >= 70){
            grade = "C";
        } else if (point >= 60){
            grade = "D";
        } else{
            grade = "F";
        }

        System.out.println(grade);
    }
}