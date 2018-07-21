package net.viralpatel.spring.model;

import java.util.Date;

/**
 *
 */
public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private Date dateOfBirth;

    /**
     *
     * @param id    id of customer
     * @param firstName name of customer
     * @param lastName
     * @param email
     * @param mobile
     */
    public Customer(long id, String firstName, String lastName, String email, String mobile) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.dateOfBirth = new Date();
    }

    public Customer() {
    }

    /**
     *
     * @return Long
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFuck(){
        return "fuck";
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}