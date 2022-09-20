package org.example.salary;

import org.example.salary.employer.Employer;

public class PieceworkBid extends Salary{
    private float[] piecework;

    public PieceworkBid(Employer employer, float[] piecework) {
        super(employer);
        this.piecework = piecework;
        this.getSalary();
    }

    @Override
    public float getSalary() {
        float res = 0;
        for (float f: piecework) {
            res+=f;
        }
        this.salary = res;
        return res;
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
