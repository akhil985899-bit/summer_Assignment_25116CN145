public class ques71 {
     
    public static int binarySearch(int arr[], int key) {

        int low = 0;
        int high = arr.length;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;      // Element found
            }

            else if (arr[mid] < key) {
                low = mid + 1;   // Search in right half
            }

            else {
                high = mid - 1;  // Search in left half
            }
        }

        return -1;   // Element not found
    }

    public static void main(String[] args) {

        // Here array is must be sorted
        int arr[] = {10, 20, 30, 40, 50, 60, 710};
        int key = 710;

        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}

