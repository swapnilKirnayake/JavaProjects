package ExceptionPractice;

public class NestedTry {
    public static void main(String[] args){

        try{

            try{
                int[] arr = {2,4,6};
                System.out.println(arr[2]);
            }catch(IndexOutOfBoundsException e){
                System.out.println("Invalid Index");
            }

            int a = 10/0;
        }catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }

    }
}
