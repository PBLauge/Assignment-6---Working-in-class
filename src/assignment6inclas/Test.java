/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6inclas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class Test
{
    
    
    public void startTest()
    {
        PersonManager personManager = new PersonManager();
        
        Teacher bent = new Teacher(1, "Bent", "bht");
        bent.setSalary(34543);
        bent.addSubject("Programming");
        bent.addSubject("Databases");
        
        Teacher stig = new Teacher(2, "Stig", "ssi");
        stig.setSalary(32434);
        stig.addSubject("ITO");
        stig.addSubject("Unity game programming");
        
        personManager.addPerson(bent);
        personManager.addPerson(stig);
        
        Student mads = new Student(10, "Mads", "CS");
        GradeInfo gi1 = new GradeInfo("SCO", 7);
        GradeInfo gi2 = new GradeInfo("SDE", 2);
        GradeInfo gi3 = new GradeInfo("ITO", 10);
        GradeInfo gi4 = new GradeInfo("Unity", 10);
        mads.addGrade(gi1);
        mads.addGrade(gi2);
        mads.addGrade(gi3);
        mads.addGrade(gi4);
        
        personManager.addPerson(mads);
        //personManager.removePerson(0);
        
        List<Student> students = personManager.getAllStudents();
        System.out.println("");
        System.out.println("ID\tNAME\tEMAIL\tEDUCATION\tAVG GRADE");
        for (Person person : students)
        {
            System.out.println(person.toString());
        }
        
        List<Teacher> teachers = personManager.getAllTeachers();
        System.out.println("");
        System.out.println("ID\tNAME\tEMAIL\tINITIALS\tSALARY\tMAIN");
        for (Person person : teachers)
        {
            System.out.println(person.toString());
        }
    }
}
