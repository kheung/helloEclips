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
public class BubbleSort implements Sorter {
    
    @Override
    public void sort(StudentRecord[] students)
    {
        for (int i = 0; i < students.length; i++){
            for (int j = 0; j < students.length-1; j++){
                
                if (students[j].getGrade() >= students[j+1].getGrade())
                {
                   StudentRecord temp = students[j];
                   students[j] = students[j+1];
                   students[j+1] = temp;
                }        
            }
    }
}
}
