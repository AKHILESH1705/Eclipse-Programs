import java.util.*;
 
public class AppendElementAtLast {
	public static void append(Node<Integer>  head, int new_data)
    {
		Node<Integer> lastNode = new Node<Integer>(new_data);
        if (head == null)
        {
            head = new Node<Integer>(new_data);     
        }
        lastNode.next = null;
        Node last = head;
        while (last.next != null){
            last = last.next;
          }
        last.next = lastNode;
    }
	
	public static void Print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
	    Node<Integer> head = null, tail = null;
		while(data!=-1) {
			Node<Integer> currentNode = new Node<Integer>(data);  
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}
			else {
//				Node<Integer> tail = head; this is not optimized way of taking Input it will take N(N-1)/2 = O(N^2);
//				while(tail.next!=null) {
//					tail = tail.next;
//				}
				
				tail.next = currentNode;
				tail = tail.next; // tail = currentNode  // this is an Optimized way it will take O(N);
			}
			data = s.nextInt();
			
		}
	    return head;
		
	}
	public static void main(String args[]) {
		Node<Integer> head =  takeInput();
		append(head,44);
		Print(head);
		
	}

}
