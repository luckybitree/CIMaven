package com.mit.cifunctions;

public class MainFunction1 {

	private String name;
	private int age;
	private String title;
	
	
	
	public MainFunction1() {
		System.out.println("the MainFunction1 is initated!");
	}
	
	
	public String getName() {
		System.out.println("the name is: " + name );
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}


	public void run(){
		System.out.println("start running...");
	}
	
}
