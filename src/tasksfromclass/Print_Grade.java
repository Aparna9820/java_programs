package tasksfromclass;

import java.util.Scanner;

public class Print_Grade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any Grade");
        String Grade= scanner.next();
        switch(Grade){
            case "A"-> System.out.println("Excellent");
            case "B"-> System.out.println("Very Good");
            case "C"-> System.out.println("Good");
            case "D"-> System.out.println("Needs Improvement");
            case "F"-> System.out.println("Fail");
            default -> System.out.println("Invalid Grade");
        }


    }
}
