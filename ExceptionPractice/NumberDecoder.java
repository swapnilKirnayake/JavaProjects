package ExceptionPractice;

public class NumberDecoder {
    public static void main(String[] args){
        String s = "123abc";

        try{
            int num = Integer.parseInt(s);
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Please enter only numbers");
        }



    }
}
