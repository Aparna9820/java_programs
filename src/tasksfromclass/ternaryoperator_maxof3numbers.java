package tasksfromclass;

public class ternaryoperator_maxof3numbers {
    public static void main(String[] args) {
        int a=78;
        int b=43;
        int c=90;
        System.out.print("Biggest Number is -> ");
        System.out.println(a>b ? (a>c?a:c) : (b>c?b:c));
    }
}
