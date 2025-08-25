package Method_ReturnValue;

public class exercise3 {

    public static int printNumber(int num){
        return num*num;
    }
    public static void main(String[] args) {
        int result = printNumber(5);
        System.out.println("Result is "+result);
    }
}
