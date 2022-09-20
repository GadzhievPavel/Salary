package org.example.salary.employer;

public class Employer {
    private String name;
    private String lastName;

    public Employer(){
        name = "Иван";
        lastName = "Иванов";
    }

    public Employer(String name, String lastName){
        this.lastName = lastName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return name +" "+lastName;
    }
}
