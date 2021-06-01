import java.util.Scanner;

public class CheckPalindromeApproach2 {
	    public static boolean isPalindrome(Node<Integer> head) {

	    	Node<Integer> temp=head,mid,h2;
	        mid=midPoint(temp);
	        h2=mid.next ;
	        mid.next=null;
	        h2=reverseIt(h2);
	        boolean flag=false;
	        while(temp!=null && h2!=null)
	        {   flag=false;
	         if(temp.data.equals(h2.data))
	              flag=true;
	             temp=temp.next;
	             h2=h2.next;

	        }
	        return flag;
	    }
	    
	    private static Node<Integer> reverseIt(Node<Integer> head)
	    {   if(head==null || head.next==null)
	        return head;
	    Node<Integer> tail=head.next;
	    Node<Integer> ans=reverseIt(head.next);
	     tail.next=head;
	     head.next=null;
	     return ans;


	    }

	    private static Node<Integer> midPoint(Node<Integer> head){
	    	Node<Integer> slow=head,fast=head;
	        while(fast.next!=null && fast.next.next!=null)
	        {
	            fast=fast.next.next;
	            slow=slow.next;
	        }
	        return slow;
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
		
	   public static void PrintLinked(Node<Integer> head) {
			while(head!=null)
			{
				System.out.print(head.data+ " ");
				head = head.next;
			}
			
	}
	   
	 public static void main(String args[]) {
			Node<Integer> head = takeInput();
			PrintLinked(head);
			System.out.println();
		System.out.println(isPalindrome(head));
	 }

}

