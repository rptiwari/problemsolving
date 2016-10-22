package sorting;

/**
 * Merge sort implementation using the algorithm described in CLRS
 */
public class MergeSort {
    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int n1 = (mid - start) + 1;
        int n2 = (end - mid);
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        int l = 0, r = 0;
        for (int i = start; i <= mid; i++, l++) {
            left[l] = arr[i];
        }
        for (int i = mid + 1; i <= end; i++, r++) {
            right[r] = arr[i];
        }

        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        l = 0;
        r = 0;
        for (int i = start; i <= end; i++) {
            if (left[l] <= right[r]) {
                arr[i] = left[l];
                l++;
            } else {
                arr[i] = right[r];
                r++;
            }
        }
    }
}
