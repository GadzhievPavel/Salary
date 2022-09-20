package org.example.salary;

import org.example.salary.Salary;
import org.example.salary.employer.Employer;

public class SalaryBid extends Salary {

    private float bidOfDay;
    private int day;

    public SalaryBid(Employer employer, int day, float bidOfDay) {
        super(employer);
        this.bidOfDay = bidOfDay;
        this.day = day;
        getSalary();
    }

    @Override
    public float getSalary() {
        salary = day*bidOfDay;
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.employer.toString());
        builder.append(" ");
        builder.append(this.getClass().getName());
        builder.append(" ");
        builder.append(salary);
        return builder.toString();
    }
}
