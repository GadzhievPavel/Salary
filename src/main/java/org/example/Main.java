package org.example;

import org.example.salary.HourlyBid;
import org.example.salary.PieceworkBid;
import org.example.salary.Salary;
import org.example.salary.SalaryBid;
import org.example.salary.employer.Employer;

public class Main {
    public static void main(String[] args) {

        HourlyBid hourlyBidUser1 = new HourlyBid(new Employer("Петр","Петров"), 5,100);
        PieceworkBid pieceworkBid = new PieceworkBid(new Employer(),new float[]{1200,2000,8000});
        SalaryBid salaryBid = new SalaryBid(new Employer("Олег","Олегов"),22,2500);

        Salary[] salaries = new Salary[]{hourlyBidUser1, salaryBid, pieceworkBid};

        for (Salary salary: salaries) {
            System.out.println(salary.toString());
        }
    }
}