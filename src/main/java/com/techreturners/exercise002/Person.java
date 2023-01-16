package com.techreturners.exercise002;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String teamName;
    private final int age;

    public Person(String firstName, String lastName, String teamName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
        this.age = age;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getAge() {
        return age;
    }

}
