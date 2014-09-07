package com.qq.spring.batch;

import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	//@Override
	public Person process(final Person person) throws Exception {
		final String firstName = person.getFirstName().toUpperCase();
		final String lastName = person.getLastName().toUpperCase();
		
		final Person newPerson = new Person(firstName, lastName);
		
		System.out.println("Converting (" + person + ") into (" + newPerson + ")");
		return newPerson;
	}
}
