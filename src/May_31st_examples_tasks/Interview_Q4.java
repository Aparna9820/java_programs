package May_31st_examples_tasks;

public class Interview_Q4 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str1.equals(str3));//true because it's equals

        System.out.println(str1.concat(str3)); //HelloHello but it stores in SCP

    }
}
