import java.util.Scanner;

public class IntersectionNode {
	
	static Scanner s = new Scanner(System.in);
	
	public static int lengthCount(Node<Integer> head) {
		int count = 0;
		while(head!=null) {
			head = head.next;
			count++;
		}
		return count;
	}
	
	public static void PrintLinked(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}
	private static int changelist(Node<Integer> h1, Node<Integer> h2) {
     int s1 = lengthCount(h1);
     int s2 = lengthCount(h2);
     int diff;
		if(s1>s2) {
			diff = s1-s2;
			for(int i = 0;i<diff;i++) {
				h1 = h1.next;
			}
		}
		else {
			diff = s2-s1;
			for(int i = 0;i<diff;i++) {
				h2 = h2.next;
			}	
		}
		while(h1!=null && h1!=h2) {
			h1 = h1.next;
			h2 = h2.next;
		}
		if(h1!=null) {
			return h1.data;
		}
		return -1;
		
	}
	private static void merge(Node<Integer> h1, Node<Integer> h2) {
      
		int n=s.nextInt();
		Node<Integer>t1=h1,t2=h2;
		while(t1!=null)
		{
			if(t1.data==n)
			{
				while(t2.next!=null)
					t2=t2.next;
				t2.next=t1;
				return;
			}
			t1=t1.next;
		}
		t1=h1;
		while(t2!=null)
		{
			if(t2.data==n)
			{
				while(t1.next!=null)
					t1=t1.next;
				t1.next=t2;
				return;
			}
			t2=t2.next;
		}
		return ;
	}

	public static Node<Integer> takeInput() {
		
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = tail.next; // tail = currentNode
			}
			data = s.nextInt();
		}
		return head;
	}
    
	public static void main(String args[]) {

		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		merge(head1,head2);
		System.out.println(changelist(head1,head2));
		

	}
	
}
