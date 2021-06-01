import java.util.Scanner;

public class ReverseLinkedList {
	
	
	public static int countlength(Node<Integer>head) {
		int count = 0;
		while(head!=null) {
			head = head.next;
			count++;
		}
		return count;
	}
	
//public static void Reverse(Node<Integer>head){
////	int len = countlength(head);  this is an non Optimized solution why because it will take O(N^2) time.
////	//System.out.println(len);
////	int len2 = len;
////	for(int i = 0;i<len;i++) {
////		Node<Integer> temp = head;
////		
////		for(int j = 1;j<len2;j++)  {
////			temp = temp.next;
////			}
////		System.out.print(temp.data + " ");
////		len2 -=1;
////	}    
//	
//	
//}	

public static void Reverse(Node<Integer> head) {

	if(head==null) {
		return;
	}
	else { 
		Reverse(head.next);
        System.out.print(head.data+" ");
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
		PrintLinked(head);
		System.out.println();
		Reverse(head);
		
		
	}
}
