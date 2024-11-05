public class BinarySearch {

    public static int binarySearch(int[] arr, int target) { 
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Kiểm tra xem phần tử giữa có phải là mục tiêu không
            if (arr[mid] == target) {
                return mid;
            }

            // Nếu phần tử giữa nhỏ hơn mục tiêu, tìm bên phải
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // Nếu không, tìm bên trái
            else {
                right = mid - 1;
            }
        }

        return -1; // Nếu không tìm thấy mục tiêu
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int target = 12;
        int result = binarySearch(arr, target);
        if (result == -1) { 
            System.out.println("Khong tim thay phan tu " + target);
        } else {
            System.out.println("Tim thay phan tu " + target + " tai vi tri " + result);
        }   
    }
}

