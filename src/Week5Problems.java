import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Week5Problems {
//    Stack<Integer> stack1;
//    Stack<Integer> stack2;
//    public void MyQueue() {
//        this.stack1 = new Stack<>();
//        this.stack2 = new Stack<>();
//    }
//    public void push(int x) {
//        while (! stack1.isEmpty()) {
//            stack2.push(stack1.pop());
//        }
//        stack1.push(x);
//        while (! stack2.isEmpty()) {
//            stack1.push(stack2.pop());
//        }
//    }
//    public int pop() {
//        if (stack1.isEmpty()) {
//            return -1;
//        }
//        return stack1.pop();
//    }
//    public int peek() {
//        if (stack1.isEmpty()) {
//            return -1;
//        }
//        return stack1.peek();
//    }
//    public boolean empty() {
//        if (stack1.isEmpty()) {
//            return true;
//        }
//        return false;
//    }
    Queue<Integer> q1;
    Queue<Integer> q2;
    public void MyStack () {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.remove();
    }
    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }
    public boolean empty() {
        return q1.isEmpty();
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] ans = new int[length];
        Stack<Integer> stack = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(i);
                ans[i] = 0;
            }
            else {
                while (! stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ans[i] = 0;
                }
                else {
                    ans[i] = stack.peek() - i;
                }

                stack.push(i);
            }
        }
        return ans;
    }
    public static void main (String[] args) {
        System.out.println("Problem 1: ");
        System.out.println("Problem 2: ");
        System.out.println("Problem 3: ");
        System.out.println("Problem 4: \n");
        System.out.println("Problem 5: ");
        int[] temp1 = {73,74,75,71,69,72,76,73};
        int[] temp2 = {30, 40, 50, 60};
        int[] temp3 = {30, 60, 90};
        System.out.println(Arrays.toString(dailyTemperatures(temp1)));
        System.out.println(Arrays.toString(dailyTemperatures(temp2)));
        System.out.println(Arrays.toString(dailyTemperatures(temp3)));
    }
}