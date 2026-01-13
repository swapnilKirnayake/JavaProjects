package ExceptionPractice;

public class MultiCatchDemo {
    public static void main(String[] args){
        int[] arr = {2,4,6};

        try{
            int result = arr[3] / 0;
            System.out.println("Answer : "+ result);
        }catch(ArithmeticException e){
            System.out.println("Cant devide by 0");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }



    }
    
}
