public class ques69 {
    public static void Bubblesort(int arr[]){
        int temp ;

        // Number of pases 
        for(int i = 0; i < arr.length-1; i++){

            //compare adjacent elements
            for(int j = 0; j < arr.length-i-1; j++){
                // Swap if left element is greater than right element
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } 
    }

    public static void main(String[] args){
        int arr[] = {1,4,7,2,5,8,3,6,9};
    
        System.out.println("Given array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
         Bubblesort(arr) ;
        System.out.println("After bubble sorting: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}