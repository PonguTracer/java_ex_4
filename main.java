import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);        
      /* Type your code here. */
      
      String fullName;
      int age;
      String salary;
      
      fullName = scnr.nextLine();
      age = scnr.nextInt();
      salary = scnr.next();
      
      System.out.println(fullName + " is " + age + " and makes $" + salary + ".");
      
   }
}
