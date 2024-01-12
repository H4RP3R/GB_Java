public class Main {
    public static void main(String[] args) {
        MyStack mStack = new MyStack();
        mStack.push(1);
        mStack.push(2);
        mStack.push(3);
        System.out.println(mStack);
        System.out.println(mStack.size());

        mStack.push(4);
        mStack.push(5);
        mStack.push(6);
        mStack.push(7);
        mStack.push(8);
        mStack.push(9);
        System.out.println(mStack);
        System.out.println(mStack.size());

        System.out.println(mStack.peek());

        System.out.println(mStack.pop());
        System.out.println(mStack);
        System.out.println(mStack.size());
    }
}