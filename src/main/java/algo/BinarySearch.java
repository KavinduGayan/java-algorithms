package algo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {3,5,6,9,12,19,25};

        System.out.println(binarySearch(array, 19));
    }

    private static int binarySearch(int[] array, int x) {
        int mid = -1;
        int low = 0;
        int high = array.length-1;
        boolean isLoop = true;
        do {
            mid = low+high/2;
            if (array[mid] > x) {
                high = mid - 1;
            } else if (array[mid] < x) {
                low = mid + 1;
            } else {
                break;
            }
        } while (isLoop);
        return mid;
    }
}
