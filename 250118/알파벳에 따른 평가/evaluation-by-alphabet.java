import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        if (grade.equals("S")){
            System.out.println("Superior");
        } else if (grade.equals("A")){
            System.out.println("Excellent");
        } else if (grade.equals("B")){
            System.out.println("Good");
        } else if (grade.equals("C")){
            System.out.println("Usually");
        } else if (grade.equals("D")){
            System.out.println("Effort");
        } else{
            System.out.println("Failure");
        }

        
    }
}