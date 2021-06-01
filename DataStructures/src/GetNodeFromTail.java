import java.util.Scanner;
import java.util.Stack;

public class GetNodeFromTail {
	public static void PrintLinked(Node<Integer> head) {
		while(head!=null)
		{
			System.out.print(head.data+ " ");
			head = head.next;
		}
		
	}
	
	public static int getNode(Node<Integer> head, int positionFromTail) {
//		Node<Integer> temp = head;  // this code is generally for to check at which position our desired element is present from tail;
//	      Stack<Integer> stack = new Stack();
//	       while (head != null) {
//	            stack.push(head.data);
//	            head = head.next;
//	        }
//	        int count = 1;
//	        while (temp != null) {
//	            int i = stack.pop();
//	            if (positionFromTail == i) {
//	                return count;
//	            }
//	            else {
//	                count++;
//	            }
//	            temp = temp.next;
//	        }   
//	            return count; 
//	        }
		int index = 0;  // this is best solution for finding node from tail
		Node<Integer> current = head;
		Node<Integer> result = head;
	    while(current!=null)
	    {
	        current=current.next;
	        if (index++ > positionFromTail)
	        {
	            result=result.next;
	        }
	    }
	    return result.data;
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
		int pos = s.nextInt();
	    PrintLinked(head);
	    int result = getNode(head,pos);
	    System.out.println("\n"+result);
		
	}

}
