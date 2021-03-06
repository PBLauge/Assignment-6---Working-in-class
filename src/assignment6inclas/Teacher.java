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
public class Teacher extends Person
{
    
    private String initials;
    private double salary;
    private List<String> subjects = new ArrayList<>();

    public Teacher(int id, String name, String initials)
    {
        super(id, name);
        this.initials = initials;
    }

    @Override
    public String toString()
    {
        String mainSubject = "";
        if(subjects.size()>0)
            mainSubject = subjects.get(0);
        
        return super.toString() + "\t" + initials + "\t\t" + salary 
                + "\t" + mainSubject; 
    }
    
    
    
    /**
     * Get the value of subjects
     *
     * @return the value of subjects
     */
    public List<String> getSubjects()
    {
        return subjects;
    }

    /**
     * Set the value of subjects
     *
     * @param subjects new value of subjects
     */
    public void addSubject(String subject)
    {
        subjects.add(subject);
    }


    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     * Set the value of salary
     *
     * @param salary new value of salary
     */
    public void setSalary(double salary)
    {
        this.salary = salary;
    }


    /**
     * Get the value of initials
     *
     * @return the value of initials
     */
    public String getInitials()
    {
        return initials;
    }

    
    
}
