
import java.util.Scanner;
class PowerOfNo{
      public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            double base , exponent , result;
            System.out.print(" base = ");
            base= sc.nextDouble();
            System.out.print(" exponent = ");
            exponent= sc.nextDouble();
            result= Math.pow(base,exponent);
            System.out.println(" Result = " + (int)result );
      }
}      
            
            