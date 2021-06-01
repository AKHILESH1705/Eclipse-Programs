import java.util.Scanner;

public class InsertNodeRecursively {
	
//	public static void Reverse(Node<Integer> head) {
//
//		if(head==null) {
//			return;
//		}
//		else { 
//			Reverse(head.next);
//	        System.out.print(head.data+" ");
//	    }
//		
//	}
//	
//	public static int countlength(Node<Integer>head) {
//		int count = 0;
//		while(head!=null) {
//			head = head.next;
//			count++;
//		}
//		return count;
//	}
	public static Node<Integer> InsertNode(Node<Integer> head ,int pos,int data) {
   // int len = countlength(head);	
		
		if(head==null && pos> 0) { // this is an efficient way
			return head;
			}
		if(pos == 0) {
			Node<Integer> newhead = new Node<Integer>(data);
			newhead.next = head;
			return newhead;
		}
//	 else if(pos>len) { this code will less optimize because it will collect length every  time
//		 return head;
//	 }
	 else {
//		 Node<Integer> smallerhead = InsertNode(head.next,pos-1,data);
//		 head.next = smallerhead;
		 head.next = InsertNode(head.next,pos-1,data);
		 return head;
	 }
}

		public static void PrintLinked(Node<Integer> head) {
			while(head!=null)
			{
				System.out.print(head.data+ " ");
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
					tail = tail.next; // tail = currentNode
				}
				data = s.nextInt();
				}
			return head;
		}
		
		public static void main(String args[]) {
			Scanner s = new Scanner(System.in);
			Node<Integer> head = takeInput();
			head = InsertNode(null,0,10);
			
			//System.out.println();
			//Reverse(head);
			PrintLinked(head);
			
			
		}
	}


