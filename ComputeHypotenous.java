

import java.util.Scanner;
class ComputeHypotenous{
       public static void main(String[] args ){

             double hypotenous, firstSide , secondSide;
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter length of 1st side = ");
             firstSide = sc.nextDouble();
             System.out.print("Enter length of 2nd side = ");
             secondSide = sc.nextDouble();
             System.out.print("Hypotenous = "+ Math.sqrt(Math.pow(firstSide , 2)+Math.pow(secondSide , 2)));
        }
}
            

          