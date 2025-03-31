public class BasicsLL {
    public static class Node {
    
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    // public static class LinkedList{

    // }
    public static void display(Node head){
        Node temp = head; 
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public static void displayRec(Node head){     
       if (head == null) return;
       System.out.print(head.data + "->");
       displayRec(head.next);
    }
    public static void displayRev(Node head){    //this function will print reverse linked list 
        if (head == null) return;
        displayRev(head.next);
        System.out.print(head.data + "->");
       
     }
     public static int length(Node a){
        int count = 0;
        while(a!=null){
            count++;
            a = a.next;
        }
        return count;
     }
     public static void insertAtEnd(Node head, int data){
        Node temp = new Node(data);
        Node t = head;

        while (t.next!= null) {
            t = t.next;
        }
        t.next = temp;
    }


    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(9);
        System.out.println(a);   //BasicsLL$Node@372f7a8d
        a.next= b;            //BasicsLL$Node@2f92e0f4
        b.next= c;            //BasicsLL$Node@28a418fc
        c.next = d;
        // d.next = null;   //koi matlab nhi isko likhne ka

        // System.out.println(a.next);   //BasicsLL$Node@2f92e0f4
        // System.out.println(a.next.next);  //b.next = c   BasicsLL$Node@28a418fc

        // Node temp = a;
        // while (temp != null) {
        //     System.out.print(temp.data + " -> ");   //3 -> 5 -> 8 -> 9 ->   basically here last pointer is empty showing its a null value

        //     temp = temp.next;
        // }
        display(a);
        System.out.println();
        displayRec(a);
        System.out.println();
        displayRev(a);

        System.out.println();
        int length = length(a);
        System.out.println("size of the linked List is : " + length);
        insertAtEnd(a, 87);
        display(a);
    }
}