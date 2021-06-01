import java.util.Scanner;

public class swapTwoAdjacentNode {
	
	private static Node<Integer> SwapAdjacent(Node<Integer> head, int n) {
		int i = 1;
		Node<Integer> p = head,q,r;
		while(i<n) {
			p = p.next;
			i++;
		}
		q = p.next;
		r = q.next;
		q.next = r.next;
		r.next = q;
		p.next = r;
		
		return head;
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
		int n = s.nextInt();
		head = SwapAdjacent(head,n);
		PrintLinked(head);
		
		System.out.println();
	
    }

	
}