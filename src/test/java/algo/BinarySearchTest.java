package algo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {



    @Test
    public void binarySearchTest() {
        int[] array = {3, 5, 6, 9, 12, 19, 25};
        BinarySearch binarySearch = new BinarySearch();
        Assert.assertEquals(4, binarySearch.binarySearch(array, 12));
    }

    @Test
    public void binarySearchRecTest() {
        int[] array = {3, 5, 6, 9, 12, 19, 25};
        BinarySearch binarySearch = new BinarySearch();
        Assert.assertEquals(4, binarySearch.binarySearchRec(array, 12, 0, array.length - 1));
    }
}
