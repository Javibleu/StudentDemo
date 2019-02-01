/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/** 
 * 
 * A class to create an array of students and print their names
 * @author dancye, 2019
 */
public class StudentArray 
{
    public static void main(String[] args)
    {
        Student[] studentList = new Student[7];
        
        
        Student student1 = new Student("1", "Jim Halpern");
        studentList[0] = student1;
        studentList[1] = new Student("2", "Michael Landon");
        studentList[2] = new Student("3", "Pam Beasley");
        studentList[3] = new Student("4", "Dwight Schrute");
        studentList[4] = new Student("5", "Toby Flendersen");
        studentList[5] = new Student("6", "Bobby Fletcher");
        studentList[6] = new Student("7", "Spoonie Loonie");
        
        
        
        for (Student a : studentList) {
            System.out.println(a.getName());
        }
    }
    
}
