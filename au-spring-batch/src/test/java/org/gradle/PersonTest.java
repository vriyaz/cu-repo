package org.gradle;

import org.junit.Test;

import com.qq.spring.batch.Person;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("John", "Smith");
        assertEquals("John", person.getFirstName());
    }
}
