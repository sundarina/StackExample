package brackets;

/**
 * Created by sun on 06.03.17.
 */
public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int max) {
        this.maxSize = max;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public  void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stackArray.length-1);
    }
}
