package Genrics;

import Vehicle.vehicle;

public class GenricBoundMenthod {
	public static<v extends PrintInterface> void printArray(v a[]) {
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			//a[3].print();
		}
		System.out.println();
	}
	public static void main(String args[]) {
		Integer a[] = new Integer[10];// int is a primitive data type thats why it will not work so  alternative is Integer class 
		for(int i = 0; i<10; i++) {
			a[i] = i+1;
		}
		Character c[] = new Character[10];
		char d = 'a';
		for(int i = 0; i<10; i++) {
			c[i] = d;
			d++;
		}
		vehicle v[] = new vehicle[10];
		for(int i = 0; i<10; i++) {
			v[i] = new vehicle(10); 
		}
		//printArray(a);
		//printArray(c);
		printArray(v);
		Student s1[] = new Student[10];
		for(int i = 0; i<10; i++) {
			s1[i] = new Student(); 
		}
		printArray(s1);
	}
}
