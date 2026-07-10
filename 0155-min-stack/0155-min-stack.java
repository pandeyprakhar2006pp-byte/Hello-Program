import java.util.*;

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;     // value
        this.second = second;   // minimum till now
    }
}

class MinStack {

    Stack<Pair> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {

        if (st.isEmpty()) {
            st.push(new Pair(val, val));
        } else {
            int mini = Math.min(val, st.peek().second);
            st.push(new Pair(val, mini));
        }
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().first;
    }

    public int getMin() {
        return st.peek().second;
    }
}