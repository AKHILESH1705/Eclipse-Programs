import java.util.*;

public class sumOftwoLinked {
	
	public static int sumLL(Node<Integer>head1, int size1, Node<Integer> head2 ,int size2,Node<Integer> res) {
		if(head1==null || head2 ==null) {
		return 0;
		}
		int data = 0;
		if(size1>size2) {
			int car = sumLL(head1.next,size1-1,head2,size2,res);
			data =  head1.data + car;
		}
		else if(size1<size2) {
			int car = sumLL(head1,size1,head2.next,size2-1,res);
			data =  head2.data + car;
		}
		else {
			int car = sumLL(head1.next,size1-1,head2.next,size2-1,res);
			data = head1.data + head2.data+car;	
		}
		int nd = data%10;
		int nc = data/10;
		
		res.addFirst(nd);
		return nc;
		
	}


	private static	Node<Integer> sumoftwo(Node<Integer> head1,Node<Integer> head2) {
	    
		int size1 = lengthCount(head1);
		int size2 = lengthCount(head2);
		Node<Integer> res = new Node<>();
		int carry  = sumLL(	head1,size1,head2,size2,res);
		if(carry!=0) {
			res.addFirst(carry);
		}
		return res;	
		

		
	}
	public static void PrintLinked(Node<Integer> head) {
		int sd = head.size();
            for(int i = 0;i<sd;i++) { 	
			System.out.print(head.get(i) + " ");
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
	public static int lengthCount(Node<Integer> head) {
		int count = 0;
		while(head!=null) {
			head = head.next;
			count++;
		}
		return count;
	}
	public static void main(String args[]) {
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer>head = sumoftwo(head1,head2);
		PrintLinked(head);
	

	}

	
}
