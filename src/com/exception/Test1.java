package com.exception;

public class Test1 {
	public int m1() {
		try {
			System.out.println("try-block");
			//throw new Exception();
			return 1;
		}catch(Exception e) {
			System.out.println("catch-block");
			return 2;
		}finally {
			System.out.println("finally-block");
			//return 3;
			//throw new Exception();
		}
	}
public static void main(String[] args) {
	/*Test1 t=new Test1();
	int result = t.m1();
	System.out.println(result);*/
	System.out.println(args.length);
}
}
