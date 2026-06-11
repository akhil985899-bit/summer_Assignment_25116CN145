public class ques43 {
    public static boolean primenumber(int n){
        boolean prime = true ;
        if(n <= 1){
            return false;
        }
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0){
                prime = false;
                break;
            }  
        }
        return prime; 
    }
    public static void main(String[] args){
       boolean result = primenumber(45);
        System.out.println(result);
    }
}
