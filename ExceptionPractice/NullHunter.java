package ExceptionPractice;

public class NullHunter {
    public static void main(String[] args){

        String s = null;

        try{
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("object is Null");

        }


    }
}
