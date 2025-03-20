class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1과 nums2를 병합한다.
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        // nums1을 정렬한다.
        sort(nums1);
    }
    public void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
    public void sort(int[] arr) {
        int count = 1;  
        while (count != 0) {
            count = 0;  
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    count++;  
                }
            }
        }
    }
}