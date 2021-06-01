import java.util.Scanner;

public class appendLastToFirst {
	private static int countLength(Node<Integer> head) {
		int count = 0;
		while(head!=null) {
			head = head.next;
			count++;
			
		}
		return count;
	}
	
	public static Node<Integer> nodeLasttoFirst(Node<Integer>head,int pos) {
		int len = countLength(head);
		Node<Integer> temp = head;
		if(pos==0) {
			return head;
		}
		else if(pos>0 && pos<len){
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = head;
			int count = 0;
			while (count < len-pos) {
				temp = temp.next;
				count++;
			}
			Node<Integer> head2 = temp.next;
			temp.next = null;
	       return head2;
	      }
		
		else {
			return head;
		}
	}
	public static void printLinkedList(Node<Integer> head ) {
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null,tail = null;
		while(data!=-1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head==null) {
				head = newNode;
				tail = newNode;
				
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt(); 
		}
		return head;
	}
	
	public static void main(String args[]) {
		
		Node<Integer> head = takeInput(); 
		Scanner s = new Scanner(System.in);
		int pos = s.nextInt();
		head = nodeLasttoFirst(head, pos);
		printLinkedList(head);
		
		
	}

}
