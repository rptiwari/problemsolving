package sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {
    MergeSort _instance;

    public MergeSortTest() {
        _instance = new MergeSort();
    }

    @Test
    public void testBasicSorting() {
        int[] arr = new int[]{3, 7, 1, 2, 0, 23, 6, 78, 2, 7};
        runTest(arr);
    }

    @Test
    public void testBasicSortingWithOddNumberOfElements() {
        int[] arr = new int[]{3, 7, 1, 2, 0, 23, 6, 78, 2, 7, 8};
        runTest(arr);
    }

    @Test
    public void testSortingWhenAllElementsAreEqual() {
        int[] arr = new int[]{10, 10, 10, 10, 10};
        runTest(arr);
    }

    @Test
    public void testSortingForMaxElements() {
        int[] arr = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        runTest(arr);
    }

    private void runTest(int arr[]) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        _instance.sort(arr);
        Arrays.sort(copyArr);
        Assert.assertArrayEquals(arr, copyArr);
    }
}
