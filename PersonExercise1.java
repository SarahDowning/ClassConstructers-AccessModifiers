package com.qa.helloworld;

public class PersonExercise1 {

	private String name;
	private String jobTitle;
	private int age;
	private float shoeSize;
	private double height;

	// All variable fields
	public PersonExercise1(String name, String jobTitle, int age, float shoeSize, double height) {

		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
		this.shoeSize = shoeSize;
		this.height = height;
	}

	// Just name and height
	public PersonExercise1(String name, double height) {

		this.name = name;
		this.height = height;
	}

	public void greet() {
		System.out.println("Hello! I'm " + name + "and I'm " + age + " years old. My height and shoe size are: "
				+ height + " and " + shoeSize + ". My job title is: " + jobTitle + ".");
	}

	public void farewell() {
		System.out.println("This is " + name + " at " + height + " signing off!");
	}

}
