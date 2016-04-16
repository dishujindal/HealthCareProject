/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class PersonDirectory {
    
     private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person createPerson(String firstName, String lastname){
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastname);
        personList.add(person);
        return person;
    }
}
