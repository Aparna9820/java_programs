package tasksfromclass;

public class triangle_type_usin_if_else {
    public static void main(String[] args) {
        int n1=10;
        int n2=10;
        int n3=10;
        if((n1 == n2) && (n2 == n3) && (n1==n3)){
        System.out.println("This is equilateral triangle");
        }
        else if ((n1 == n2) || (n2 == n3) || (n1==n3)){
        System.out.println("This is isosceles triangle");
        }
        else {
        System.out.println("This is scalene triangle");
        }

    }
    }
