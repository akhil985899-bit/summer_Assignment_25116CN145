public class ques44 {
    public static int factorial(int n){
        int pro = 1;
        for(int i = 1; i <= n; i++){
            pro *= i;
        }
        return pro;
    }
    public static void main(String[] args){
        int result = factorial(5);
        System.out.println("Given number factorial is: "+ result);
    }
}
