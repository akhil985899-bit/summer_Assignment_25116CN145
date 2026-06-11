public class ques42 {
    public static int maximum(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args){
        int result = maximum(15,41);
        System.out.println("Maximum of two numbers is: "+ result);
    }
}
