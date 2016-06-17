package com.github.yashk.contacts;

import org.apache.commons.collections4.trie.PatriciaTrie;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by yashk on 6/11/16.
 */
public class Main {

    public static void main(String args[]){
        Console console = System.console();
        final ContactsBook contactsBook = new PatriciaTrieContactsBook();

        if(console!=null){
            String line;
            while((line=console.readLine("%s","1) Add contact 2) Search 3) Exit\n"))!=null) {
                try {
                    switch (Integer.parseInt(line)) {
                        case 1:
                            String name = console.readLine("%s", "Enter name:");
                            contactsBook.addContact(Contact.parse(name));
                            break;
                        case 2:
                            final String searchTerm = console.readLine("%s", "Enter name:");
                            contactsBook.searchContacts(searchTerm).forEach((v)->System.out.println(v));
                            break;
                        case 3:
                            console.printf("%s", "Happy Searching\n");
                            return;
                    }

                }catch (NumberFormatException e){
                    System.out.println("valid input 1 or 2 or 3");
                }
            }

        }
    }
}
