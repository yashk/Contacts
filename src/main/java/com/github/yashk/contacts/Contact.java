package com.github.yashk.contacts;

import java.util.Objects;

/**
 * Created by ykochare on 6/12/16.
 */
public class Contact {

    private final String firstName;

    private final String lastName;

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Returns a contact object form string , also does basic validations.
     * @param name
     * @return Contact
     */
    public static Contact parse(String name){
        if(name == null){
            throw new IllegalArgumentException("name can not be null");
        }

        if(name.length() > 50){
            throw new IllegalArgumentException("name can not be longer than 50 chars");

        }

        final String[] split = name.split(" ");
        String firstName = split[0];
        String lastName = "";

        if(split.length > 1){
            lastName = split[1];
        }

        return new Contact(firstName,lastName);

    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastName, contact.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
