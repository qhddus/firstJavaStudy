package com.godofjava.first;

import java.util.Objects;

public class Myfirst {
	private String name;
	private int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	@Override
	public String toString() {
		return "Myfirst [name=" + name + ", age=" + age + "]";
	}
	public Myfirst(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Myfirst other = (Myfirst) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

}
