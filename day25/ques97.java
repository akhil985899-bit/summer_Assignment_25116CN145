 public class ques97 {
    public static void main(String[] args) {
        // First sorted array
        int[] arr1 = {1, 3, 5, 7};

        // Second sorted array
        int[] arr2 = {2, 4, 6, 8};

        // Size of both arrays
        int n1 = arr1.length;
        int n2 = arr2.length;

        // Create a new array to store merged elements
        int[] merged = new int[n1 + n2];

        // i -> arr1 index
        // j -> arr2 index
        // k -> merged array index
        int i = 0, j = 0, k = 0;

        // Compare elements and store the smaller one
        while (i < n1 && j < n2) {

            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of arr1
        while (i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2
        while (j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        // Print merged array
        System.out.print("Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
 }

