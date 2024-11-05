package sortAIgorithm;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11}; // Mảng số nguyên mẫu
        System.out.println("Mang truoc khi sap xep:");
        printArray(arr);

        selectionSort(arr); // Gọi hàm sắp xếp

        System.out.println("Mang sau khi sap xep:");
        printArray(arr); // In mảng đã sắp xếp
    }

    // Hàm để in mảng
    
}
