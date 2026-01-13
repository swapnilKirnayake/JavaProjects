package ExceptionPractice;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputShield {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter a Number : ");
            int x = sc.nextInt();
            System.out.println("You entered : " + x);
        }catch(InputMismatchException e){
            System.out.println("Enter Only Numbers");
        }
    }
}
