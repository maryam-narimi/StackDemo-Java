public class StackDemo {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackDemo(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = value;
            System.out.println(value + " pushed onto stack.");
        } else {
            System.out.println("Stack Overflow!");
        }
    }

    public void pop() {
        if (top >= 0) {
            int value = stackArray[top];
            top--;
            System.out.println(value + " popped from stack.");
        } else {
            System.out.println("Stack Underflow!");
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }
}
