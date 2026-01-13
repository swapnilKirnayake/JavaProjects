package ExceptionPractice;

import java.util.Scanner;

public class DivideSafely {
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Numerator : ");
    int n = sc.nextInt();

    System.out.println("Enter Denominator : ");
    int d = sc.nextInt();

try{
    int result = n/d;
    System.out.println("Answer : "+ result);
}catch(ArithmeticException e){
    System.out.println("Cannot divide by 0");
}

}

}  

