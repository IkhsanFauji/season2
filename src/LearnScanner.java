// import API / Library java Scanner
import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // create new object Scanner
        System.out.println("Hi!!");
        System.out.println("What is your name ?");
        System.out.println("===================");
        System.out.println("Hello..");
        String name = input.next(); // create variable name wit input requirement in console
        System.out.println("My name is "+ name);
    }
}
