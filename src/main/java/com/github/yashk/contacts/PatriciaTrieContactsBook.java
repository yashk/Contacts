package com.github.yashk.contacts;

import org.apache.commons.collections4.trie.PatriciaTrie;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ykochare on 6/12/16.
 */
public class PatriciaTrieContactsBook implements ContactsBook {

    /**
     * Using PatriciaTrie data structure from apache commons-collections for efficient prefix based string search.
     * https://commons.apache.org/proper/commons-collections/apidocs/org/apache/commons/collections4/trie/PatriciaTrie.html
     */
    public PatriciaTrie<Contact> trie = new PatriciaTrie<>();


    /**
     * adds a
     * @param contact
     * into ContactsBook
     */
    @Override
    public void addContact(Contact contact) {

        trie.put(contact.getFirstName()+contact.getLastName(),contact);
        if((!contact.getLastName().isEmpty() )) {
            trie.put(contact.getLastName()+contact.getFirstName(),contact);
        }
    }

    /**
     * returns a list of matching contacts given a
     * @param searchTerm
     *
     */
    @Override
    public List<Contact> searchContacts(String searchTerm) {
       return trie.prefixMap(searchTerm).values().stream().collect(Collectors.toList());
    }
}
