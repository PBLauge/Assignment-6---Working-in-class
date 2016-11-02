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
 * @author Peder
 */
public class PersonManager
{
    private List<Person> persons = new ArrayList<>();
    
    public PersonManager()
    {
    }
    
    public List<Person> getAllPersons()
    {
        return persons;
    }
    
    public void removePerson(int id)
    {
        Person person = getPerson(id);
        if(person!=null)
        {
        persons.remove(person);
        }
    }
    
    public void addPerson(Person person)
    {
        if(!doesExist(person))
        {
            persons.add(person);
        }
    }
    
    private boolean doesExist(Person person)
    {
        if(getPerson(person.getId())==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public Person getPerson(int id)
    {
        for (Person person : persons)
        {
            if(person.getId()==id)
            {
                return person;
            }
        }
        return null;
    }
}
