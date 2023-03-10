package algo;

public class BinarySearch {

    /**
     * Binary search iterative method
     *
     * @param array
     * @param x
     * @return
     */
    public int binarySearch(int[] array, int x) {
        int mid;
        int low = 0;
        int max = array.length - 1;
        do {
            mid = (low + max) / 2;
            if (array[mid] > x) {
                max = mid - 1;
            } else if (array[mid] < x) {
                low = mid + 1;
            } else {
                break;
            }
        } while (true);
        return mid;
    }

    /**
     * Binary search recursive method
     * @param array
     * @param x
     * @param low
     * @param max
     * @return
     */
    public int binarySearchRec(int[] array, int x, int low, int max) {
        int mid = (low + max) / 2;
        if (array[mid] < x) {
            return binarySearchRec(array, x, mid + 1, max);
        } else if (array[mid] > x) {
            return binarySearchRec(array, x, low, mid - 1);
        } else {
            return mid;
        }
    }
}
