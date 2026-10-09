class MinStack {

        Stack<Integer> stack = new Stack<>();
    Queue<Integer> setMin = new PriorityQueue<>(Integer::compare);

    public MinStack() {

    }

    public void push(int value) {
        stack.push(value);
        setMin.add(value);
    }

    public void pop() {
        Integer popped = stack.pop();
        setMin.remove(popped);
    }

    public Integer top() {
        if (setMin.isEmpty()) {
            return null;
        }
        return stack.peek();
    }

    public Integer getMin() {
        if (setMin.isEmpty()) {
            return null;
        }
        return setMin.peek();
    }
}

