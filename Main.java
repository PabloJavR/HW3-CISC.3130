// Name: Pablo Reyes
// Java
// Visual Studio Code
public class Main {

    // part 2 - adt questions
    // Q1: ADT stands for Abstract Data Type.
    // Q2: An ADT describes what a data structure does, meaning its operations
    //     and rules, without saying how it is built.
    // Q3: The ADT is the WHAT (the operations and behavior). The implementation
    //     is the HOW (the actual code and storage, like an array).
    // Q4: Yes. Two programmers can build the same ADT in different ways as long
    //     as both follow the same operations and rules.
    // Q5: Yes, both are still Stacks because a Stack is defined by its LIFO
    //     behavior, not by what it is made of inside.


    // part 3 - stack adt
    // A Stack is LIFO (Last In, First Out), like a stack of plates.
    // Pushing 15, 25, 35 and then calling pop() removes 35.


    // part 4 - required stack operations
    // push(), pop(), peek(), isEmpty().
    // The Stack is built with a simple array.
    static class MyStack {
        private int[] items = new int[10];  // holds the stack values
        private int count = 0;              // how many values are in the stack

        // Add a value to the top
        public void push(int value) {
            items[count] = value;
            count++;
        }

        // Remove and return the top value
        public int pop() {
            count--;
            return items[count];
        }

        // Look at the top value without removing it
        public int peek() {
            return items[count - 1];
        }

        // True if the stack has no values
        public boolean isEmpty() {
            return count == 0;
        }
    }


    // part 5 - build your stack
    // part 6 - test your stack
    // part 7 - stack output
    static void stackDemonstration() {
        MyStack stack = new MyStack();

        System.out.println("STACK DEMONSTRATION");
        System.out.println("Adding:");
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(45);
        stack.push(55);
        System.out.println("15\n25\n35\n45\n55");

        System.out.println("Top item:");
        System.out.println(stack.peek());

        System.out.println("Removing:");
        System.out.println(stack.pop());
        System.out.println("Removing:");
        System.out.println(stack.pop());

        System.out.println("New top:");
        System.out.println(stack.peek());

        System.out.println("Is Stack empty?");
        System.out.println(stack.isEmpty());
    }


    // part 8 - stack questions
    // Q6: LIFO means Last In, First Out. The most recent item added is the first one removed.
    // Q7: 55 was added last so it was on top, while 15 was added first and stayed at the bottom.
    // Q8: D is removed first because it was added last.
    // Q9: A browser Back button. Each visited page is pushed onto a Stack and clicking Back pops the most recent page.


    // part 9 - queue adt
    // A Queue is FIFO (First In, First Out), like people standing in line.
    // If A arrives, then B, then C, the order is A -> B -> C and A is served first.


    // part 10 - required queue operations
    // enqueue(), dequeue(), peek(), isEmpty().
    // The Queue is also built with a simple array. The front is items[0].
    static class MyQueue {
        private int[] items = new int[10];  // holds the queue values
        private int count = 0;              // how many values are in the queue

        // Add a value to the back
        public void enqueue(int value) {
            items[count] = value;
            count++;
        }

        // Remove and return the front value
        public int dequeue() {
            int frontItem = items[0];
            // Shift everything left so the next value becomes the front
            for (int i = 1; i < count; i++) {
                items[i - 1] = items[i];
            }
            count--;
            return frontItem;
        }

        // Look at the front value without removing it
        public int peek() {
            return items[0];
        }

        // True if the queue has no values
        public boolean isEmpty() {
            return count == 0;
        }
    }


    // part 11 - build your queue
    // part 12 - test your queue
    // part 13 - queue output
    static void queueDemonstration() {
        MyQueue queue = new MyQueue();

        System.out.println("QUEUE DEMONSTRATION");
        System.out.println("Adding:");
        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(45);
        queue.enqueue(55);
        System.out.println("15\n25\n35\n45\n55");

        System.out.println("Front item:");
        System.out.println(queue.peek());

        System.out.println("Removing:");
        System.out.println(queue.dequeue());
        System.out.println("Removing:");
        System.out.println(queue.dequeue());

        System.out.println("New front:");
        System.out.println(queue.peek());

        System.out.println("Is Queue empty?");
        System.out.println(queue.isEmpty());
    }


    // part 14 - queue questions
    // Q10: FIFO means First In, First Out. The item that arrived first is removed first.
    // Q11: 15 was added before 55 so it was at the front of the Queue.
    // Q12: Alex leaves first because Alex entered the line first.
    // Q13: Printer jobs. Documents print in the order they were sent so the first job submitted prints first.


    // part 15 - stack vs queue
    // Scenario 1 (Undo): Stack. The most recent action is undone first which is LIFO.
    // Scenario 2 (Printer): Queue. The first document submitted prints first so its is FIFO.
    // Scenario 3 (Back button): Amazon appears first. This resembles a Stack because the last page visited is the first one you go back to.
    // Scenario 4 (Customer service): Queue. The customer who arrived first is helped first.
    // Scenario 5 (Plates): Stack. The last plate placed is the first one taken is LIFO.


    // part 16 - predict the output
    // I predict that pop() returns 18. This is because the Stack removes the most recent item and the final peek() returns 22. because it was the last value it pushed and is now on top
    // I also predict dequeue() returns 7. This is because the Queue removes the first item added. Hence the final peek() returns 12 because then 12 becomes the front. Removing 7
    // Q14: pop() returns 18.
    // Q15: The final peek() returns 22.
    // Q16: dequeue() returns 7.
    // Q17: The final peek() returns 12.
    static void predictOutput() {
        MyStack testStack = new MyStack();
        testStack.push(7);
        testStack.push(12);
        testStack.push(18);
        System.out.println("Stack pop() returns: " + testStack.pop());
        testStack.push(22);
        System.out.println("Stack final peek() returns: " + testStack.peek());

        MyQueue testQueue = new MyQueue();
        testQueue.enqueue(7);
        testQueue.enqueue(12);
        testQueue.enqueue(18);
        System.out.println("Queue dequeue() returns: " + testQueue.dequeue());
        testQueue.enqueue(22);
        System.out.println("Queue final peek() returns: " + testQueue.peek());
    }


    // part 17 - compare the adts
    // Feature          | Stack                    | Queue
    // Rule             | LIFO                     | FIFO
    // Add operation     | push()                   | enqueue()
    // Remove operation   | pop()                    | dequeue()
    // View next item     | peek() (top)             | peek() (front)
    // First item removed | Most recently added item | Earliest added item


    // part 18 - connect the adt to the implementation
    // Q18: The ADT is the Stack itself: its LIFO rule and its operations
    //      (push, pop, peek, isEmpty).
    // Q19: The implementation is the array and the code that stores and moves
    //      the values.
    // Q20: No the ADT did not change. It has the same operations and LIFO
    //      rule and only the way it is built inside changed.


    // part 19 - program requirements
    // part 20 - code organization
    // The program below shows Stack = LIFO (55 leaves first) and
    // Queue = FIFO (15 leaves first). Each part above has its own labeled section.
    public static void main(String[] args) {
        stackDemonstration();      // Parts 5-7
        System.out.println();
        queueDemonstration();      // Parts 11-13
        System.out.println();
        predictOutput();           // Part 16
    }
}