package Arrays_MathMax;

public class exercise5 {
    public static void main(String[] args){
        int[] num = {8,2,9,3,1};
        int biggest = num[0];
        for(int n: num){
            biggest = Math.max(biggest, n);

        }
        System.out.println("Biggest = "+biggest);
    }
}