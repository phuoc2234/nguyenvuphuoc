import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue {
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node topNode;

    MyLinkedListStack() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;  // Stack is empty
        }
        int value = topNode.value;
        topNode = topNode.next;
        return value;
    }

    @Override
    public boolean isFull() {
        return false;  // Linked list-based stack is never full
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = topNode;
        ArrayList<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.value);
            temp = temp.next;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
