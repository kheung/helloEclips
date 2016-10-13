/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2043lab1;

import java.util.Scanner;

/**
 *
 * @author H
 */

public class assignmentApp1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        int sortChoice;
		Scanner scanner = new Scanner(System.in);                
		System.out.println("How many students record to sort?");
		int size = scanner.nextInt();
		String[] name = new String[size];
		int[] grade = new int[size];
		
                
		StudentRecord[] st = new StudentRecord[size];
                
                for (int i=0; i<size; i++)
		{
			System.out.println("Please input the student name?");
			name[i] = scanner.next();
                        System.out.println("Student grade?");
			grade[i] = scanner.nextInt();
			st[i] = new StudentRecord(name[i],grade[i]);                      
                                               
		}
		
		System.out.println("please input the sorting option: 1. Select Sort, 2. Bubble Sort");
		sortChoice = scanner.nextInt();
		
                if (sortChoice == 1)
                {
                    SelectSort ss = new SelectSort();
                    ss.sort(st);
                    for(StudentRecord st1:st)
                    {
                        System.out.println(st1.getName()+", "+st1.getGrade());
                    }
                } else 
                {
                    BubbleSort bs = new BubbleSort();
                    bs.sort(st);
                    for(StudentRecord st1:st)
                    {
                        System.out.println(st1.getName()+", "+st1.getGrade());
                    }
                }
	
	scanner.close();
    }
    /*public static void main(String[] args)
    {
        StudentRecord s;
        s = new StudentRecord();
        StudentRecord[] st = new StudentRecord[3];
        st[0] = new StudentRecord();
        st[0].setName("aa");
        st[0].setGrade(7)4;
        st[1] = new StudentRecord();
        st[1].setName("bb");
        st[1].setGrade(9);
        st[2] = new StudentRecord();
        st[2].setName("cc");
        st[2].setGrade(10);
        
        System.out.println("st1: " + st[1].getGrade());
        
        SelectSort ss = new SelectSort();
        ss.sort(st);
        
        //System.out.println(st[1].getGrade());
        //System.out.println(st[2].getGrade());
    }*/
}
