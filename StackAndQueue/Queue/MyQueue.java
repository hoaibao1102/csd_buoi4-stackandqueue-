package StackAndQueue.Queue;

public class MyQueue {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }
        
    }
    private Node front ;
    private Node rear ;
    private int length;
    public MyQueue(){
        this.front= null;
        this.rear = null;
        this.length= 0;
    }

    public int getlength(){
        return this.length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    // HÀM ENQUEUE
    public void EnQueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }
    
    // HÀM DEQUEUE: REMOVE FRONT ELENMENT 
    public int DeQueue(){
        int data;
        Node temp = front;
        if(isEmpty()){
            return (Integer) null;
        }
        data = temp.getData();
        front= temp.next;
        length--;
        if(front == null){
            rear = null;
        }
           
        
        return data;
    }

    // hàm display
    public void displayList(){
        Node temp = front;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else if(length == 1){
            System.out.print(temp.getData());
        }
        while(temp != null){
            System.out.print(temp.getData() );
            if(temp.next != null){
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }
}

    
