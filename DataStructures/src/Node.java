import java.io.*;
import java.util.LinkedList;
public class Node<T> extends LinkedList<T> {

	T data;
	Node<T> next;
	
	public Node(T data){ // this is an Constructor which require a data
		this.data = data;
		//next = null;
	}
	public Node () {
	
	}

}
//class DoubleLinked {
//	Node<Integer> head;
//	Node<Integer> tail;
//
//DoubleLinked() {
//
//	}
//DoubleLinked(Node<Integer> head, Node<Integer> tail) {
//		this.head = head;
//		this.tail = tail;
//	}
//}