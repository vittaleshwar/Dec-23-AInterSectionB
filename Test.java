package com.vittal;

class Emp{
	int id;
	String name;
	int sal;
	String address;
	String college;
	public Emp(int id, String name, int sal, String address, String college) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address = address;
		this.college = college;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + ", college=" + college
				+ "]";
	}
	
}

public class Test {
	public static void main(String[] args) {
		
		Emp s1 = new Emp(100,"Ramu",4500,"Hyd","Hp");
		System.out.println(s1);

	}

}
