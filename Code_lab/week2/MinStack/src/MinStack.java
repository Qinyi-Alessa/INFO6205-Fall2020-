import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> getMin;
    public MinStack(){
        stack = new LinkedList<Integer>();
        getMin = new LinkedList<Integer>();
    }
    public int pop(){
        if (stack.isEmpty()){
            return -1;
        }
        Integer result = stack.pollFirst();
        if (getMin.peekFirst().equals(result)){
            getMin.pollFirst();
        }
        return result;
    }
    public void push(int value){
        stack.offerFirst(value);
        if (getMin.isEmpty() || value <= getMin.peekFirst()){
            getMin.offerFirst(value);
        }
    }
    public int top(){
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peekFirst();
    }
    public int getMin(){
        if (getMin.isEmpty()){
            return -1;
        }
        return getMin.peekFirst();
    }
}
