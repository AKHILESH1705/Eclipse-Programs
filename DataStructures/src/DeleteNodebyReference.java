import java.util.Scanner;

public class DeleteNodebyReference {
	
	

	private static void deleteNode(Node<Integer> node) {
//		int temp = node.data;
//		node.data = node.next.data;
//		node.next.data = temp;
//		     
//     node.next = node.next.next; 
     Node<Integer> temp = node.next;
     node.data = temp.data;
     node.next = temp.next;
        
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
		

		Node<Integer> temp = head;
		int k = s.nextInt();
		int count = 1;

		while(count < k) {
			temp = temp.next;
			count += 1;
		}
		deleteNode(temp);
		 PrintLinked(head);
	}

}
