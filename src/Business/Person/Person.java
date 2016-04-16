/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author rekhajindal
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String SsnNumber;
    private String emailID;
    private String partEmailID;
    private long phoneNumber;
    private String gender;
    private String dateofBirth;
    private int id;
    private Address personAddress;
    private WorkQueue workQueue;
    private static int count = 1;

    public Person() {
        id = count;
        count++;
       workQueue=new WorkQueue(); 
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsnNumber() {
        return SsnNumber;
    }

    public void setSsnNumber(String SsnNumber) {
        this.SsnNumber = SsnNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

   public Address getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(Address personAddress) {
        this.personAddress = personAddress;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String getPartEmailID() {
        return partEmailID;
    }

    public void setPartEmailID(String partEmailID) {
        this.partEmailID = partEmailID;
    }

    
    
    @Override
    public String toString() {
        return firstName;
    }
    
    
}
