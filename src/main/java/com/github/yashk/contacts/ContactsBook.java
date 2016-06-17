package com.github.yashk.contacts;

import java.util.List;

/**
 * Created by ykochare on 6/12/16.
 */
public interface ContactsBook {

    public void addContact(Contact contact);

    public List<Contact> searchContacts(String searchTerm);
}
