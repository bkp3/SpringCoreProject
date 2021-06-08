package com.springcore.constructorInjection;

public class Person {

	private int pId;
	private String name;
	private Certi certi;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int pId, String name, Certi certi) {
		super();
		this.pId = pId;
		this.name = name;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.pId + " : " + this.name + " : " + this.certi;
	}

}
