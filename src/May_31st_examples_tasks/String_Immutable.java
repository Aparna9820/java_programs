package May_31st_examples_tasks;

public class String_Immutable {
    public static void main(String[] args){
        String name="Aparna";//SCP(String Constant Pool)
        name.toUpperCase();
        System.out.println(name);// o/p-Aparna not APARNA because upperstring is not having Assignment operator
    }
}
