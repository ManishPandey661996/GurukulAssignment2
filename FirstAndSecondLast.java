
import java.util.Scanner;
class FirstAndSecondLast{
      public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int number, originalNumber , firstDigit , secondLastDigit;
             System.out.print(" Enter a five-digit number  = ");
             originalNumber = sc.nextInt();
             number = originalNumber;
             originalNumber = number/10;
             secondLastDigit = originalNumber%10;
             originalNumber =originalNumber/1000;
             firstDigit = originalNumber%10;
             System.out.println(" output : "+ firstDigit +" + " +  secondLastDigit +" = " +(firstDigit + secondLastDigit));
      }
}
             