import java.util.Scanner;

public class SwapTwoNodes {

	

	private static Node<Integer> swapNodes(Node<Integer> head, int m, int n) {
		Node<Integer> newhead = head;
		Node<Integer> t1=head;
		Node<Integer> t2=head;
	        
	        for(int a=0;a<m;a++)
	         {
	            t1=t1.next;
	         }
	         for(int b=0;b<n;b++)
	         {
	    		t2=t2.next;
	         }
	        int temp = t1.data;
	            t1.data = t2.data;
	            t2.data = temp;
	        return newhead;
	}

	public static void PrintLinked(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}
	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
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
		Scanner s = new Scanner(System.in);
		Node<Integer> head = takeInput();
		int m = s.nextInt();
		int n = s.nextInt();
		head = swapNodes(head, m, n);
		PrintLinked(head);
	}
}
