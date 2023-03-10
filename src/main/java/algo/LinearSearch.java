package algo;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 2, 6, 9, 7, 6};
        int n = 6;
        System.out.println(search(arr, n));
    }

    private static int search(int[] arr, int n) {
        int occ=-1;
        for (int i = 0; i< arr.length; i++) {
            if (n == arr[i]) {
                occ= i;
                break;
            }
        }
        return occ;
    }
}
