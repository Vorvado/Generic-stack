import java.util.EmptyStackException;

public class GenericStack <T> {
    private T[] stack;
    private int top = 0;
    public GenericStack(){
        stack = (T[])new Object[10];
    }

    public GenericStack(int capacity) {
        stack = (T[]) new Object[capacity];
    }

    public void push(T value){
        if (top == stack.length){
            throw new StackFullException("Stack is already full");
        }
        stack[top] = value;
        top++;
    }
    public T pop(){
        if (top == 0){
            throw new StackEmptyException("Stack is empty");
        }
        T value = stack[top-1];
        stack[--top] = null;
        return value;
    }

    public T peek(){
        if (top == 0){
            throw new StackEmptyException("Stack is empty");
        }
        return stack[top-1];
    }

    public String list(){
        String list = "";
        for( T t : stack){
            list +=  t.toString() + ";";
        }
        return list;
    }
}
