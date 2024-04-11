import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a , b , choice;

    System.out.println("Enter the first number");
    a=sc.nextInt();
    System.out.println("Enter the second number");
    b=sc.nextInt();

    System.out.println("Enter the choice" +     
    "\n1.Addition" + "\n2.Subtraction" + 
    "\n3.Multiplication" + "\n4.Division");

    choice=sc.nextInt();

    switch(choice)
      {
          case 1:
            System.out.println("Addition is " + (a+b));
            break;
          case 2:
            System.out.println("Subtraction is " + (a- 
            b));
            break;
          case 3:
            System.out.println("Multiplication is " + 
            (a*b));
          case 4:
            System.out.println("Division is " + (a/b));
            break;
      }
  }

}