package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private  MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        this(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try {
            if ( juniorDevelopers[index]== null) {
                 juniorDevelopers[index] = juniorDeveloper;
            } else {
                System.out.println("Sorry, " + juniorDeveloper.getName() + "... Index " + index + " is full for junior team. It is already fulfilled by " + juniorDevelopers[index].getName());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index " + index + " not found. You may get 'ArrayIndexOutOfBoundsException'");
        }

    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try {
            if ( midDevelopers[index]== null) {
                 midDevelopers[index] = midDeveloper;
            } else {
                System.out.println("Sorry, " + midDeveloper.getName() + "... Index " + index + " is full for mid team. It is already fulfilled by " + midDevelopers[index].getName());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index " + index + " not found. You may get 'ArrayIndexOutOfBoundsException'");
        }

    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {
            if (seniorDevelopers[index]== null) {
                seniorDevelopers[index] = seniorDeveloper;
            } else {
                System.out.println("Sorry, " + seniorDeveloper.getName() + "... Index " + index + " is full for senior team. It is already fulfilled by " + seniorDevelopers[index].getName());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index " + index + " not found. You may get 'ArrayIndexOutOfBoundsException'");
        }

    }



    @Override
    public void work() {
        setSalary(getSalary() + 100000);
        System.out.println(getName() + " HR Manager starts working...");
    }

    @Override
    public String toString() {
        return "HRManager >> {" +
                "Personal info " + super.toString() +
                ", juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
