package ExceptionPractice;

public class ThrowDemo {
    public static void main(String[] args){
        int age = 15;
        if(age<18){
            throw new IllegalArgumentException("Not eligible for Voting");
        }
        else{
            System.out.println("Eligible for Voting");
        }
    }
}
