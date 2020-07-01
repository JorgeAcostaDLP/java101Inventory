package com.acme.testing;
////This is a practice quiz. Answers at the bottom.
//static int a = 10;
////	Problem 1
//int []a = {1,2,3,4,5,6};
//int i = a.length-1;
//
//while(i>=0) {
//	System.out.print(a[i]);
//	i--;
//}
//}
////	Problem 2
//int x=0, y=10;
//try {
//	y/=x;
//	}
//System.out.print("/ by 0");
//catch(Exception e) {
//	System.out.print("error");
//	}
//
////		Problem 5
//int a[] = {1,2,3,4,5};
//System.out.print(a instanceof Object);
////		Problem 6
//int a[] = { 1,2,053,4}; //int with a 0 in fron is octal
//int c = 053;
//int b[][] = { {1,2,4} , {2,2,1},{0,43,2}};
//System.out.print(a[3]==b[0][2]);
//System.out.print(" " + (a[2]==b[2][1]));
////Problem 7
//int a[][] = new int[3][]; //second dimension can change
////		Second dimension in array is optional in Java. You can create a two dimensional array without specifying both dimension 
////		e.g. int[4][] is valid array declaration.The reason behind that is Java doesn't support multi-dimensional array in true 
////		sense. In a true two dimensional array all the elements of array occupy a contiguous block of memory , but that's not true in Java.
////		Instead a multi-dimensional array is an array of array. 
//a[1] = new int[] {1,2,3};
//a[2] = new int[] {4,5};
//a[0] = new int[] {1,2,3,4,5,6,7,89};
//System.out.println(a[1][1]);
//System.out.print(Arrays.deepToString(a));
//}	
//Problem 9
//class Ex1 {
//int a=10;
//public static void main(String[] args) {
//	new Ex1().print();
//	}
//public void print() {
//	int a=8; //looks here first for a (local)
//	System.out.print(a+ " ");
//	}
//Problem 10
//for(int a =0; a<5; a++) {
//System.out.print(a); //local a is reasigned to 0
//}
//System.out.print(a); //local variable not found goes to static (all the way at the top)
//Problem 11
//public class Person {
//	Person(String s, int i){
//		++pid;
//		name=s;
//		age=i;
//		}
//	
//	static int pid;
//	int age;
//	String name;
//	}
//
//class Test{
//	public static void main(String[] args) {
//		Person p1 = new Person("John" , 22);
//		Test te = new Test();
//		Person p2 = te.change(p1);
//		System.out.println(p2.pid + " " + p2.name+ " "+p2.age);
//		System.out.println(p1.pid + " " + p1.name+ " "+p1.age);
//	}
//
//	private Person change(Object o) {
//		Person p2 = (Person)o; //this changes the ref p2 to point to object created at p1 declaration
//		p2.age = 25; //this alters p1 person object
//		return p2;
//		}
//	}
//Problem 12
//class Person{
//	public static void main(String args[]) {
//		int x=10; //cant change this because it is a primitive
//		int y= new Person().change(x); 
//		System.out.print(x+y);
//	}
//	int change (int x) { //.change means change it to 12 no matter what
//		x=12;
//		return x;
//	}
//}
//Problem 13
//class Person{
//	public static void main(String args[]) {
//		String s = "Java";
//		s.concat(" SE6"); //not stored anywhere
//		System.out.println(s.concat(" SE 6").replace('6','7')); //chaining methods works
//	}
//Problem 14
//class Person{
//	public static void main(String args[]) {
//		String person = "Java";
//		person.concat(" SE6");
//		person.toLowerCase();
//		System.out.print(person); //chaining methods
//	}
//}
//
//class Person{
//	public static void main(String[] args) {
//		new Person().pass();
//	}
//	
//	public void pass() {
//		int a=10, b=20;
//	}
//	
//	public void print(int a) {
//		int c = b/a; //b is not accesible from here
//		System.out.print(c);
//	}
//}