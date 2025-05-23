package tasksfromclass;

public class Nested_ternary_operator {
    public static void main(String[] args) {
        int age=25;
        String result = age>65?"Senior": (age<18?"Minor": "Adult");
        System.out.println(result);
    }
}
