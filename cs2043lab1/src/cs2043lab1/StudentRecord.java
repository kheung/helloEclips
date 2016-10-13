/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2043lab1;

/**
 *
 * @author H
 */

public class StudentRecord {
        
        private String name;
	private int grade;
      

    public StudentRecord() {
    }

    public StudentRecord(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

  

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    
}
