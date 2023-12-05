

import java.util.Scanner;
class ProfitOnInvestment{
      public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int principal , time ;
             double rate , CI ;
             System.out.print("Enter the Principal amount : ");
             principal = sc.nextInt();
             System.out.print("Enter the Time Period : ");
             time= sc.nextInt();
             System.out.print("Enter the Intrest rate : ");
             rate = sc.nextDouble();
             
             
             System.out.print("CI  : "+ principal*(Math.pow(1+rate/100,time)));

      }
}
             