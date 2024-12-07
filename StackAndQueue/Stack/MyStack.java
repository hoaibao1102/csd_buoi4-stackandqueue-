package StackAndQueue.Stack;

public class MyStack{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        public int getData(){
            return data;
        }
    }
    private Node top;
    private int length;
    public MyStack(){
        this.top = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    //hàm push
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    //HÀM POP: REMOVE TOP ELEMENT AND RETURN DATA OF REMOVED ELEMENT
    public int pop(){
        int data;
        Node temp = top;
        if(isEmpty()){
            return (Integer) null;
        }
        data = top.getData();
        top = top.next;
        length--;
        return data;
    }

    // hàm display
    public void displayList(){
        Node temp = top;
        if(isEmpty()){
            System.out.println("List is empty");
        }
        while(temp != null){
            System.out.print(temp.getData() );
            if(temp.next != null){
                System.out.print(" <- ");
            }
            temp = temp.next;
        }
    }

}