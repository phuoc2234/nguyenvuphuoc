public class MyArrayQueue implements IStackQueue {
    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    // Constructor
    public MyArrayQueue(int size) {
        SIZE = size;
        array = new int[SIZE];
        headIndex = tailIndex = -1;
    }

    // Thêm phần tử vào queue
    @Override
    public boolean push(int value) {
        if (!isFull()) {
            if (isEmpty()) {
                headIndex = 0;  // Đặt headIndex thành 0 khi queue trống
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    // Lấy phần tử ra khỏi queue
    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = array[headIndex];
            headIndex++;
            // Reset lại headIndex và tailIndex nếu queue rỗng
            if (headIndex > tailIndex) {
                headIndex = tailIndex = -1;
            }
        }
        return value;
    }

    // Kiểm tra queue đầy chưa
    @Override
    public boolean isFull() {
        return tailIndex == SIZE - 1;
    }

    // Kiểm tra queue trống không
    @Override
    public boolean isEmpty() {
        return headIndex == -1 && tailIndex == -1;
    }

    // Hiển thị các phần tử trong queue
    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            for (int i = headIndex; i <= tailIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    // Đếm số lượng phần tử trong queue
    public int count() {
        if (isEmpty()) {
            return 0;
        } else {
            return tailIndex - headIndex + 1;
        }
    }

    // Test the queue implementation
    public static void main(String[] args) {
        MyArrayQueue queue = new MyArrayQueue(5); // Tạo queue với kích thước 5

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Queue after pushing elements: ");
        queue.show(); // Hiển thị queue

        System.out.println("Pop element: " + queue.pop());
        System.out.println("Queue after popping an element: ");
        queue.show(); // Hiển thị queue sau khi lấy một phần tử ra

        System.out.println("Count of elements: " + queue.count());
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Is queue full? " + queue.isFull());
    }
}
