package ExceptionPractice;

public class FinallyDemo {
    public static void main(String[] args){
        try{
            int result = 10/0;
            System.out.println("Result  : "+ result);
        }catch(ArithmeticException e){
            System.out.println("Exception caught");
        }finally{
            System.out.println("Program Finished");
        }
    }
}
