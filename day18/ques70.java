public class ques70 {

    public static void selectionSort(int arr[]) {

        // Move the boundary of the unsorted array
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current element is the minimum
            int minIndex = i;

            // Find the smallest element in the remaining array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = {64, 25, 12, 22, 11};

        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        selectionSort(arr);

        System.out.print("\nSorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    

