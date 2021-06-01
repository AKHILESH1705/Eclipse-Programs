
public class LinkedList2 {

		 public static void print(Node<Integer> head){
		   // Node<Integer> temp = head;
		   // System.out.println(temp); this temp will store address of node2;
	
//		    while(temp != null){
//		        System.out.print(temp.data +" ");
//		        temp = temp.next;
//		    }
//		    System.out.println();
			 while(head != null){
			        System.out.print(head.data +" ");
			        head = head.next;
			    }
			    System.out.println();
			    
			    
		}

		public static void main(String args[]){

		    Node<Integer> node1 = new Node<Integer>(10);
		    Node<Integer> node2 = new Node<Integer>(20);
		    Node<Integer> node3 = new Node<Integer>(30);
		    Node<Integer> node4 = new Node<Integer>(40);
		    node1.next = node2;
		    node2.next = node3;
		    node3.next = node4;
		    System.out.println(node2);
		    print(node1);
		    
		   }
		}


