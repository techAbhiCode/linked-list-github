public class linkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int data){
            Node temp = new Node(data);

            if(head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        void display(){
            Node temp = head;
            // int count =0;
            while (temp != null) {
                System.out.print(temp.data + " ");
                // count++;
                temp = temp.next;

            }
            System.out.println();
            // System.out.println("size of the linked list : "+count);
        }
        // int size(){
        //     Node temp = head;
        //     int count =0;
        //     while(temp!=null){
        //         count++;
        //         temp = temp.next;
        //     }
        //     return count;

        // }
        void insertAtFirst(int data){
            Node temp = new Node(data);
            if(head == null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx, int data){
            Node newNode = new Node(data);
            Node temp = head;
            if(idx == size){
                insertAtEnd(data);
                return;
            }else if(idx == 0){
                insertAtFirst(data);
                return;
            }else if(idx<0 || idx>size){
                System.out.println(" You have given Wrong Index ");
                return;
            }
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

            size++;
        }
        int getAT(int idx){
            if(idx<0 || idx>size){
                System.out.println(" You have given Wrong Index ");
                return -1;
            }
            Node temp = head;
            for(int i =1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if(idx == 0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i =1; i<idx; i++){
                temp = temp.next;
            }
           
            temp.next = temp.next.next;
            tail  = temp;
            size--;
        }

        
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.display();
        ll.insertAtFirst(9);
        ll.display();

        ll.insertAt(3, 10);   //9 3 5 10 8
        ll.display();                     //9 3 5 10 8
        System.out.println("tail value of linkedList : "+ll.tail.data);   //8

        ll.insertAt(0, 100);
        ll.display();
        int a = ll.getAT(3);
        System.out.println("Getting Value of A particular index is : " + a);

        System.out.println("The size of the linkedList is : " + ll.size);
        
        System.out.println();
        ll.deleteAt(0);
        ll.display();
        System.out.println(ll.tail.data); //10 
    }
}
