import java.util.Scanner;

public class RemoveNode {
	public static int countLength(Node<Integer>head){
		int count = 0;
		while(head!=null) {
			head = head.next;
			count++;
		}
		return count;
	}
	
	
	public static Node<Integer> Remove(Node<Integer>head, int pos){
		
		int len = countLength(head);
		Node<Integer> newHead = null;
		if(pos==0) {
			newHead = head.next;
             return newHead;
		}
        else if(pos > 0 && pos<len){
          int count = 0 ;
          Node<Integer> prev = head;
			while(count<pos-1 && prev!=null) {
				 prev= prev.next;
				 count++;
			}
			if(prev!=null) {
				Node<Integer> nextNode = prev.next.next;
	            prev.next = nextNode; 
		    }
			return head;
        }
        else{
            return head;
        }
	}


	public static void PrintLinkedList(Node<Integer> head) {
		
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null,tail = null;
		while(data!=-1) {
			Node<Integer> currentNode = new Node<Integer>(data);  
			if(head==null) {
				head = currentNode;
				tail = currentNode;
			}
			else {
				tail.next = currentNode;
				tail = tail.next;
			}
			data = s.nextInt(); 
		}
		
		return head;
		
	}
	public static void main(String args[]) {
		
	  Node<Integer> head = takeInput();
	  Scanner s = new Scanner(System.in);
	  int pos = s.nextInt();
	  head = Remove(head,pos);
	  PrintLinkedList(head);
	  
	  }
}
