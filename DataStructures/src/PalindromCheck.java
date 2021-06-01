import java.util.Scanner;

public class PalindromCheck {
	
	public static Node<Integer> reverse(Node<Integer> head){
		
		Node<Integer> prev = null;
		while(head!=null) {
			Node<Integer> temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
	}
		return prev;
}
	public static boolean isPalindrom(Node<Integer> head){
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;	
		}
		if(fast!=null) {
			slow = slow.next;
		}
		Node<Integer> newhead = reverse(slow);
		
		while(newhead!=null) {
			if(newhead.data!=head.data) {
				return false;
			}
			else {
				newhead = newhead.next;
				head = head.next;
			}
		}
		return true;
	}		
	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null,tail = null;
		while(data!=-1) {
			Node<Integer> newnode = new Node<>(data);
			if(head==null) {
				head =  newnode;
				tail = newnode;
			}
			else {
				tail.next = newnode;
				tail = tail.next;
			}
			data = s.nextInt();		
		}
		return head;
	}
	public static void main(String args[]) {
		Node<Integer> head = takeInput();
		System.out.println(isPalindrom(head));
	}
	
}
