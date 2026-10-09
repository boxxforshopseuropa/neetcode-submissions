class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> operatorSet = Set.of("+", "-", "/", "*");
        Stack<Integer> operand = new Stack<>();

        for (String token : tokens) {
            if (operatorSet.contains(token)) {
                int operand2 = operand.pop();
                int operand1 = operand.pop();
                switch (token) {
                    case "+": {
                        operand.push(operand1 + operand2);
                        break;
                    }
                    case "-": {
                        operand.push(operand1 - operand2);
                        break;
                    }
                    case "*": {
                        operand.push(operand1 * operand2);
                        break;
                    }
                    case "/": {
                        operand.push(operand1 / operand2);
                        break;
                    }
                }
            } else {
                operand.push(Integer.parseInt(token));
            }
        }

        return operand.pop();
    }
}
