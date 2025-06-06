package May_31st_examples_tasks;

public class Interview_Q3 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";// In SCP 2 strings are available
        String s3="hello";
        String s4=new String("Hello");
        String s5=new String("hello");
        String s6 =new String("hello");

        System.out.println(s1==s4);//output-->false because it's not posible to compare the SCP & object area strings
        System.out.println(s1==s2);//true
        System.out.println(s3==s6);//false

        System.out.println(s5==s6);//false-->because the strings having seperate memory location

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
        System.out.println(s3.equals(s4)); //false
        System.out.println(s5.equalsIgnoreCase(s6)); //true



    }
}
