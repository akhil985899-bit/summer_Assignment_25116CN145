public class ques65 {
    public static int[] merge(int arr1[], int arr2[]){
        int merged[] = new int[arr1.length+arr2.length];
        for(int i = 0; i < arr1.length; i++){
            merged[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            merged[arr1.length+i] = arr2[i];
        }
        return merged;
    }

    public static void main(String[] args){
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6};
        
        int result[] = merge(arr1, arr2);
        System.out.println("Merged array is: ");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
