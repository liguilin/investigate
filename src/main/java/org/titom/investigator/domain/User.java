/**
 * Copyright (C) 2014 GIGABase.org
 */
package org.titom.investigator.domain;

/**
 * This class represents a user of the application
 * 
 * @author <a href="mailto:g.chabirand@gigabase.org">Gaël Chabirand</a>
 *
 */
public class User {
    
    private Long userId;
    public String firstName;
    public String lastName;

    public User() {

    }

    /**
     * @return the userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
