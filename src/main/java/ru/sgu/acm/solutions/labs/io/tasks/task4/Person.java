package ru.sgu.acm.solutions.labs.io.tasks.task4;

import java.io.Serializable;
import java.util.Formatter;
import java.util.List;

public class Person implements Serializable {
    private String firstName;
    private String middleName;
    private String lastName;

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    private List<Person> children;

    @Override
    public String toString() {
        return new Formatter().format("Person : { %s, %s, %s }", firstName, middleName, lastName).toString();
    }

    @SuppressWarnings("unused")
    public String getFirstName() {
        return firstName;
    }
    @SuppressWarnings("unused")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @SuppressWarnings("unused")
    public String getMiddleName() {
        return middleName;
    }
    @SuppressWarnings("unused")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    @SuppressWarnings("unused")
    public String getLastName() {
        return lastName;
    }
    @SuppressWarnings("unused")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @SuppressWarnings("unused")
    public List<Person> getChildren() {
        return children;
    }
    @SuppressWarnings("unused")
    public void setChildren(List<Person> children) {
        this.children = children;
    }
}
