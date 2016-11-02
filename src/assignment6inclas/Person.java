/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6inclas;

/**
 *
 * @author jeppjleemoritzled
 */
public abstract class Person
{
    
    private String name;
    private String email;
    private int id;

    public Person(int id, String name)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString()
    {
        return id + "\t" + name + "\t" + email; //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId()
    {
        return id;
    }


    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        Person otherPerson = (Person)obj;
        return this.id == otherPerson.getId(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
