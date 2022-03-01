import java.util.Scanner;
public class Factorial { 

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    int num = scn.nextInt(); 
    long factorial = 1; 

    for(int i = 1; i <= num; ++i) { 

      factorial *= i; 

   } 
   System.out.print("Factorial of " + num + "=" + factorial); 

} 

}
