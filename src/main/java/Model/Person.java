/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author forumkaria
 */
public class Person {

    String firstName;
    String lastName;
    Address currentAddress;
    Address permanentAddress;
    String collegeName;
    String nuid;
    Contact personalContact;
    Contact workContact;


    public
    Person() {
        this.firstName = "";
        this.lastName = "";
        this.currentAddress = new Address();
        this.permanentAddress = new Address();
        this.collegeName = "";
        this.nuid = nuid;
        this.personalContact = new Contact();
        this.workContact = new Contact();
    }

    public
            String getFirstName() {
        return firstName;
    }

    public
            void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public
            Address getCurrentAddress() {
        return currentAddress;
    }

    public
            void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public
            Address getPermanentAddress() {
        return permanentAddress;
    }

    public
            void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public
            String getLastName() {
        return lastName;
    }

    public
            void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public
            String getCollegeName() {
        return collegeName;
    }

    public
            void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public
            String getNuid() {
        return nuid;
    }

    public
            void setNuid(String nuid) {
        this.nuid = nuid;
    }

            public
    Contact getPersonalContact() {
        return personalContact;
    }

    public
    void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public
    Contact getWorkContact() {
        return workContact;
    }

    public
    void setWorkContact(Contact workContact) {
        this.workContact = workContact;
    }

}
