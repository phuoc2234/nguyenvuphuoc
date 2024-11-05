public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};  // Mảng ví dụ
        int target = 8;  // Giá trị cần tìm

        int result = linearSearch(arr, target);  // Gọi hàm linearSearch
        
        if (result != -1) {
            System.out.println("Vi tri phan tu tim thay tai: " + result);
        } else {
            System.out.println("Phan tu khong ton tai trong mang.");
        }
    }
}