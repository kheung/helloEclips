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

public class SelectSort implements Sorter{

        
        @Override
	public void sort(StudentRecord[] students)
	{
            //System.out.println("students1 grade"+students[1].getGrade());
              //int[] array = new int[students.length];
              for (int i = 0; i < students.length-1; i++) {
              
              
              int maxIndex = 0;
             //System.out.println(students[maxIndex].getGrade());
              int j;

              for (j = 1; j < students.length-i; j++){
                                                   
                 // System.out.println("student" + j + " grade: "+students[j].getGrade());
                  //System.out.println(students[maxIndex].getGrade());
              if (students[j].getGrade() > students[maxIndex].getGrade()) {maxIndex = j;}

                  StudentRecord temp = students[maxIndex];
                  //System.out.println("temp grade"+temp.getGrade());
                 
                  students[maxIndex] = students[j-1];

                  students[j-1] = temp;

        }
		
	}
	
}
}
