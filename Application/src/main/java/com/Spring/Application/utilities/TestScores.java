package com.Spring.Application.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestScores {

	public static void main(String[] args) {
		List<String> person = new ArrayList<String>();
		person.add("Sri");
		person.add("Ram");
		person.add("Sanjay");
		person.add("John");
		person.add("Jim");

		for (String persons : person) {
			System.out.println(persons);
		}

		ListIterator<String> checkPerson = person.listIterator();
		System.out.println("The list traverses forward");
		while (checkPerson.hasNext()) {
			System.out.println(checkPerson.next());
		}
		System.out.println("Now, The list traverses backwords");

		while (checkPerson.hasPrevious()) {

			System.out.println(checkPerson.previous());
		}
	}

}
