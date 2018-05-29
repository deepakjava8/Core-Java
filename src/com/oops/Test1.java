package com.oops;

class A{
	public void m1() {
		System.out.println("A-class-method");
	}
}
class B extends A{
	public void m1() {
		System.out.println("B-class-method");
	}
}
class C extends B{
	public void m1() {
		System.out.println("C-class-method");
	}
}
public class Test1 {
public static void main(String[] args) {
	A a=new B();
	a.m1();
	A a2=new C();
	a2.m1();
}
}
