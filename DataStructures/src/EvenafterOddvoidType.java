import java.util.Scanner;

public class EvenafterOddvoidType {
	
    public static Node<Integer> changelist(Node<Integer> head) {

	 Node<Integer> t1 = new Node<Integer>(0), t2 = new Node<Integer>(0), h1, h2;
     h1 = t1;
     h2 = t2;
     while (head != null && head.next != null)
     {
         h1.next = head;
         head = head.next;
         h1 = h1.next;
         h2.next = head;
         head = head.next;
         h2 = h2.next;
     }
     h1.next = head;
     if (h1.next != null)
         h1 = h1.next;
     h2.next = null;
     h1.next = t2.next;
     return t1.next;
 }


	static void printlist(Node<Integer> Node)
	{
	    while (Node != null){
	        System.out.print(Node.data + "->");
	        Node= Node.next;
	    }
	    System.out.println("NULL") ;
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
			Node<Integer> newNode= new Node<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = tail.next; // tail = currentNode<Integer>
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String args[]) {
		Node<Integer> head = takeInput();
		head = changelist(head);
		PrintLinked(head);

	}

	private static void EvenOddLinked(Node<Integer> head) {
	
		
	}
}
