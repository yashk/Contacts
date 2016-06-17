package com.github.yashk.contacts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


/**
 * Created by ykochare on 6/12/16.
 */
public class PatriciaTrieContactsBookTest {

    ContactsBook contactsBook;

    @Before
    public void setup(){
        contactsBook = new PatriciaTrieContactsBook();

    }

    @After
    public void tearDown(){
        contactsBook = null;
    }

    @Test
    public void basicSmokeTest(){
        contactsBook.addContact(Contact.parse("Chris Harris"));
        contactsBook.addContact(Contact.parse("Chris"));
        final List<Contact> result = contactsBook.searchContacts("Ch");
        assertThat(result).contains(Contact.parse("Chris"),Contact.parse("Chris Harris"));
    }



    @Test
    public void exactMatchRanksHigherThanOtherMatches(){
        contactsBook.addContact(Contact.parse("Chris Harris"));
        contactsBook.addContact(Contact.parse("Chris"));
        final List<Contact> result = contactsBook.searchContacts("Chris");
        assertThat(result).containsExactly(Contact.parse("Chris"),Contact.parse("Chris Harris"));
    }

    @Test
    public void searchByLastName(){
        contactsBook.addContact(Contact.parse("Chris Harris"));
        contactsBook.addContact(Contact.parse("Chris"));
        final List<Contact> result = contactsBook.searchContacts("Harris");
        assertThat(result).containsExactly(Contact.parse("Chris Harris"));
    }
}
