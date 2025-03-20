import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        // 각 명령어 [i, j, k]에 대해
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]; // 시작 인덱스 (1-indexed)
            int end = commands[i][1];   // 끝 인덱스 (1-indexed)
            int kth = commands[i][2];   // k번째 원소 (1-indexed)
            result[i] = getNum(array, start, end, kth);
        }
        return result;
    }
    
    public int getNum(int[] arr1, int start, int end, int kth) {
        // arr1에서 start번째부터 end번째까지 자르기 (1-indexed)
        int size = end - start + 1;
        int[] subArr = new int[size];
        for (int i = 0; i < size; i++) {
            subArr[i] = arr1[start - 1 + i];
        }
        
        // 버블 정렬로 정렬 (배열의 길이가 짧으므로 괜찮음)
        bubbleSort(subArr);
        // kth번째 원소 반환 (1-indexed -> 0-indexed)
        return subArr[kth - 1];
    }
    
    // 버블 정렬 구현 (do-while을 이용한 swapped 플래그 방식)
    public void bubbleSort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }
    
    public void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
