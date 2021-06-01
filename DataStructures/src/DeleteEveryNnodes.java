import java.util.Scanner;

public class DeleteEveryNnodes {
	
	public static Node deleteNodes(Node head, int M, int N)
    {
		if(head==null)
            return head;
        if(M==0)
            return null;
        if(N==0)
            return head;
      
        Node<Integer> t1 = head,t2=null;
        int count;
        while(t1!=null)
        {
        for(count=1;count<M && t1!=null;count++)
        {
        	t1=t1.next;
        }
        if(t1==null) {
            return head;
        }
        t2=t1.next;
        for(count=1;count<=N && t2!=null;count++)
        {
            t2=t2.next;
        }
        t1.next=t2;
        t1=t2;
        }
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
		int t = s.nextInt();
		while(t>0) {
		Node<Integer> head = takeInput();
		int m = s.nextInt();
		int n = s.nextInt();
		head = deleteNodes(head,m,n);
		PrintLinked(head);
		
		System.out.println();
		t--;
	 }

	}
}
