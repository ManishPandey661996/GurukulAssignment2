
import java.util.Scanner;
class Calculator{
      public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int firstNo , secondNo ;
             char operator;
             System.out.print("Enter 1st number : ");
             firstNo = sc.nextInt();
             System.out.print("Enter 2nd number : ");
             secondNo = sc.nextInt();
             System.out.print("Enter the operation to be performed (+,-,/,*) : ");
             operator = sc.next().charAt(0);
             if(operator=='+'){
                  System.out.print(" Result : "+ firstNo + operator + secondNo + " = " +(firstNo + secondNo));
             }
             if(operator=='-'){
                  System.out.print(" Result : "+ firstNo + operator + secondNo + " = " +(firstNo - secondNo));
             }
             if(operator=='*'){
                  System.out.print(" Result : "+ firstNo + operator + secondNo + " = " +(firstNo * secondNo));
             }
             if(operator=='/'){
                  System.out.print(" Result : "+ firstNo + operator + secondNo + " = " +(firstNo / secondNo));
             } 

     }
}