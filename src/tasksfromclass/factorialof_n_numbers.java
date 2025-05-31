package tasksfromclass;

import java.util.Scanner;

public class factorialof_n_numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int number=scanner.nextInt();
        int fact=1;
        if(number==0 || number==1 || number<0)
            System.out.println("factorial of" + number + " is "+ fact);
        else{
            for(int i=2;i<=number;i++)
                fact=fact*i;
            System.out.println("factorial of" + number + " is " + fact);
        }
    }
}
