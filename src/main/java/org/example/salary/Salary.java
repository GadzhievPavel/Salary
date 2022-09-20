package org.example.salary;

import org.example.salary.employer.Employer;

public abstract class Salary {
    protected Employer employer;
    protected float salary;

    public Salary(Employer employer){
        this.employer = employer;
    }

    public abstract float getSalary();
}
