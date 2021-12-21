package courses__java_Bases;

class Node {
    public Node previous;
    public int value;

    public Node(int value) {
        this.value = value;
        this.previous = null;
    }

    public Node(int value, Node previous) {
        this.previous = previous;
        this.value = value;
    }
}

public class StackArray {
    private Node head;

    public void push(int value) {
        head = (head == null) ? new Node(value) : new Node(value, head);
    }

    public int pop() {
        if (head == null) {
            return -1;
        } else {
            int result = head.value;
            head = head.previous;
            return result;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.pop();

        stack.push(11);
        stack.push(12);
        while (!stack.isEmpty()) {
            System.out.println("stack = " + stack.pop());
        }
    }
}
