package com.qa.helloworld;

public class RunnerExercise1 {

	public static void main(String[] args) {

		PersonExercise1 sarah = new PersonExercise1("Sarah", "Apprentice Software Engineer", 26, 5, 163.5);
		PersonExercise1 jay = new PersonExercise1("Jay", "Full stack dev", 27, 10, 180.2);
		PersonExercise1 helen = new PersonExercise1("Helen", 160);
		PersonExercise1 andrew = new PersonExercise1("Andrew", 178.5);

		sarah.greet();
		jay.farewell();
		helen.greet();
		andrew.farewell();

	}
}