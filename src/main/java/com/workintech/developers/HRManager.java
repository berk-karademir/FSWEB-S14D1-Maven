package com.workintech.developers;

public class HRManager extends Employee{
    private String[] juniorDevelopers = new String[3];
    private String[] midDevelopers = new String[5];
    private String[] seniorDevelopers = new String[7];
    // HRManager classı Employee super classının subclassıdır ||
    // Employee parent class HRManager child classtır.
    // Aynı durum JuniorDeveloper, MidDeveloper, SeniorDeveloper classları için de geçerli.
    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
    }

    //add employee
    public void addEmployee(String newJunior){
        for ( int i = 0 ; i < juniorDevelopers.length ; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = newJunior;
            }

            if(i> juniorDevelopers.length) {
                System.out.println("Junior dev team is full :(");
            } else if (juniorDevelopers[i].equals(newJunior)) {
                System.out.println("This spot is already full.");
            }
        }
    }
}
