import java.util.Scanner;
import java.util.Stack;

public class PalindromeLinkedList {
	
	public static boolean isPalindrome(Node<Integer> head)
    {
 
		Node<Integer> slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();
 
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }
 
        while (head != null) {
 
            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
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
		Node<Integer> head = takeInput();
		PrintLinked(head);
		System.out.println();
	System.out.println(isPalindrome(head));
 }

}
