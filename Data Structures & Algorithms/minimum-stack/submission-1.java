class MinStack {

    class Node{
        int min;
        int val;

        public Node(int v,int m){
            min = m;
            val = v;
        }
    }
    Deque<Node> st;
    public MinStack() {
        st = new ArrayDeque<>();
    }
    
    public void push(int val) {
        int currentMin = st.isEmpty() ? val : Math.min(val, st.peek().min);
        st.push(new Node(val, currentMin));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}