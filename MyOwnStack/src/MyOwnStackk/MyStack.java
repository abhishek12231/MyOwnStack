package MyOwnStackk;

import java.util.EmptyStackException;

//generic class representing a stack. can pass in String or Integers
public class MyStack<T> {
 // array to store elements of the stack
 private Object[] elements;

 // index representing the top of the stack
 private int top;

 // constructor initializes the stack with a given capacity. i passed in 5
 public MyStack(int capacity) {
     elements = new Object[capacity]; // create an array to hold elements
     top = 0; // initialize the top index
 }

 // checks if the stack is empty
 public boolean empty() {
     return top == 0; // the stack is empty when the top index is 0
 }

 // Pushes an item onto the stack
 public T push(T item) {
     if (top == elements.length) {
         throw new StackOverflowError("Stack is full"); // throw an exception if the stack is full
     } else {
         elements[top] = item; // add the item to the stack
         top++; // increment the top index
         return item; // return the pushed item
     }
 }

 // pops an item from the stack
 public T pop() {
     if (empty()) {
         throw new EmptyStackException(); // throw an exception if the stack is empty
     } else {
         top--; // decrement the top index
         T poppedItem = (T) elements[top]; // get the item at the top of the stack
         elements[top] = null; // set the top position to null for garbage collection
         return poppedItem; // return the popped item
     }
 }

 // peeks at the top item of the stack without removing it
 public T peek() {
     if (empty()) {
         throw new EmptyStackException(); // throw an exception if the stack is empty
     } else {
         return (T) elements[top - 1]; // return the item at the top of the stack
     }
 }

 // creates a string representation of the elements in the stack
 public String listElements() {
     StringBuilder result = new StringBuilder();
     for (int i = 0; i < top; i++) {
         result.append(elements[i]).append(", "); // append each element to the result string
     }
     if (top > 0) {
         result.setLength(result.length() - 2);
     }
     return result.toString(); // return the string representation of the elements
 	}
}


