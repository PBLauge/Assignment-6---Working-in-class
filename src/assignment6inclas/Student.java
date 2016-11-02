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
public class Student extends Person
{
    
    private List<GradeInfo> gradeReport = new ArrayList<>();
    private String education;

    public Student(int id, String name, String education)
    {
        super(id, name);
        this.education = education;
    }
    
    /**
     * Gets the grade for the specified subject 
     *
     * @return the grade for specific subject,  
     *         -1 if the subject is not found
     */
    public int getGrade(String subject)
    {
        for (GradeInfo gradeInfo : gradeReport)
        {
            // if(gradeInfo.getSubject()==subject)
            if(gradeInfo.getSubject().equals(subject))
            {
                return gradeInfo.getGrade();
            }
        }
        return -1;
    }
    
    public void addGrade(GradeInfo gi)
    {
        gradeReport.add(gi);
    }
    
    /**
     * Gets the calculated average grade, from all grades 
     *
     * @return average grade from all grades, -1 if student has no grades
     */
    public double getAverageGrade()
    {
        if(gradeReport.isEmpty())
        {    
            return -1;
        }
        
        double sumOfGrades = 0;
        
        for (GradeInfo currentGradeInfo : gradeReport) // enhanced for loop fore
        {
            sumOfGrades = sumOfGrades + currentGradeInfo.getGrade();
        }
        
        return sumOfGrades/gradeReport.size();
    }
    
    /**
     * Get the value of education
     *
     * @return the value of education
     */
    public String getEducation()
    {
        return education;
    }
    
    /**
     * Get the value of gradeReport
     *
     * @return the value of gradeReport
     */
    public List<GradeInfo> getGradeReport()
    {
        return gradeReport;
    }

    @Override
    public String toString()
    {
        return super.toString() + 
                "\t" + education + "\t\t" + getAverageGrade(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
