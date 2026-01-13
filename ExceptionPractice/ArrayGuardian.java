package ExceptionPractice;

public class ArrayGuardian {
    public static void main(String[] args){
    int[] arr = {2,3,4,5};

    try{
        System.out.println(arr[4]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index out of range");
    }
    
}
}