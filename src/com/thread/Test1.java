package com.thread;

class MyThread extends Thread{
	public void run() {
		System.out.println("run method");
	}
	public void start() {
		System.out.println("start method");
	}
}
public class Test1 {
public static void main(String[] args) {
	MyThread t1=new MyThread();
	MyThread t2=new MyThread();
	t1.run();
	t2.start();
	t2.start();
}
}
