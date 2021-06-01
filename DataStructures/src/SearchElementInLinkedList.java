import java.util.*;

public class SearchElementInLinkedList {
	
	public static int Search(Node<Integer> head, int i){
		int count = 0;
		while(head!=null)
		{
			if(head.data==i) {
				return count;
			}
			else {
				count++;
			}
			head = head.next;	
		}
		return 0;
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
	    Node<Integer> head = null;
		while(data!=-1) {
			Node<Integer> currentNode = new Node<Integer>(data);  
			if(head == null) {
				head = currentNode;
			}
			else {
				Node<Integer> tail = head;
				while(tail.next!=null) {
					tail = tail.next;
				}
				tail.next = currentNode; 
			}
			data = s.nextInt();
			
		}
	    return head;
		
	}
	public static void main(String args[]) {
		Node<Integer> head =  takeInput();
		Print(head);
		System.out.println();
		System.out.println(Search(head, 4));
		
	}
}
