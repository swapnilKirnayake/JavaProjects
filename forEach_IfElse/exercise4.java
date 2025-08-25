package forEach_IfElse;

public class exercise4 {
    public static void main(String[] args){
    int[] candies = {1,0,1,0,0,1};
    for(int n: candies){
        if(n==1){
            System.out.println("Sweet");
        }
        else{
            System.out.println("sour");
        }
    }
    
}}
