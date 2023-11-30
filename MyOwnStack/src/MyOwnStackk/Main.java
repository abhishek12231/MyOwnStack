package MyOwnStackk;
//question-
//create your own stack and list all the elements

public class Main {
    public static void main(String[] args) {
        // creating a stack with a capacity of 5 and its a integer stack
        MyStack<Integer> intStack = new MyStack<>(5);

        // pushing some integers into the stack
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        // print the elements in the stack
        // calling method in the other class
        System.out.println("Stack Elements: " + intStack.listElements());

        // peeking at the top element without removing it. it should show 30
        System.out.println("Peeked Element is " + intStack.peek());

        // poping an element from the stack. should pop 30
        int poppedElement = intStack.pop();
        System.out.println("Popped Element is " + poppedElement);

        // check if the stack is empty. should show no
        System.out.println("Empty? " + intStack.empty());

        // push more elements onto the stack
        intStack.push(40);
        intStack.push(50);

        // print the updated elements in the stack. should be 10,20,40,50. 50 being at the top
        System.out.println("All Elements in MyStack: " + intStack.listElements());

        // pop all elements from the stack
        while (!intStack.empty()) {
            intStack.pop(); //stack is now empty because we used a while loop to empty it
        }

        // attempting to pop from an empty stack will throw an EmptyStackException

        System.out.println("All Elements: " + intStack.listElements()); // now its empty
        //running perfectly
    }
    //  the MyStack class is implemented using a generic type T to allow for storing elements of any type
    //  the stack is internally represented using an ArrayList
    //  the push method adds an element to the top of the stack
    //  the pop method removes and returns the top element
    //  and the peek method returns the top element without removing it
    //  the isEmpty method checks if the stack is empty
}
