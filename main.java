import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);        
      /* Type your code here. */
      String name = scnr.nextLine();
      String age = scnr.nextLine();
      String salary = scnr.nextLine();
      System.out.println(name + " is " + age + " and makes $" + salary + ".");
   }
}
