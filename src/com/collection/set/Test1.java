package com.collection.set;

import java.util.HashSet;
import java.util.Set;

class Employee{
	int id;
	Employee(int id){
		this.id=id;
	}
	public String toString() {
		return ""+id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		Employee other = (Employee) obj;
		boolean flag=false;
		if (id != other.id)
			return flag;
		return true;
	}
	
}
public class Test1 {
public static void main(String[] args) {
	Employee e1=new Employee(1);
	Employee e2=new Employee(2);
	Employee e3=new Employee(1);
	Set<Employee> set=new HashSet<>();
	set.add(e1);
	set.add(e2);
	set.add(e3);
	System.out.println(set.size());
	for(Employee e:set) {
		System.out.println(e);
	}
	
}
}
