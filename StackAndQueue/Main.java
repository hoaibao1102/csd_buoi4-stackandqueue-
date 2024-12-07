package StackAndQueue;

import StackAndQueue.Queue.MyQueue;

public class Main {
    public static void main(String[] args) {

        // TEST HÀM QUEUE
        MyQueue queue = new MyQueue();
        //test hàm enqueue
        queue.EnQueue(7);
        queue.EnQueue(2);
        queue.EnQueue(3);
        queue.EnQueue(6);
        queue.EnQueue(5);
        queue.displayList();
        System.out.println();
        //test hàm deque
        System.out.println("node da xoa la "+queue.DeQueue());
        queue.displayList();


        // // TEST HÀM STACK
        // MyStack stack = new MyStack();
        // //test hàm push
        // stack.push(4);
        // stack.push(3);
        // stack.push(7);
        // stack.push(2);
        // stack.push(5);
        // stack.displayList(); 
        // System.out.println();
        
        // // test hàm pop
        // stack.pop();
        // System.out.println("item da xoa la: "+ stack.pop());
        // stack.displayList();
    }
}

