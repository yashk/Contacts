package com.github.yashk.contacts;

import org.apache.commons.collections4.trie.PatriciaTrie;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Created by yashk on 6/11/16.
 */
public class Main {

    public static void main(String args[]){

        Console console = System.console();
        List<String> contacts = new ArrayList<String>();
        final PatriciaTrie<String> trie = new PatriciaTrie<String>();



        if(console!=null){
            String line;
            while((line=console.readLine("%s","1) Add contact 2) Search 3) Exit\n"))!=null) {

                try {
                    switch (Integer.parseInt(line)) {
                        case 1:
                            String name = console.readLine("%s", "Enter name:");
                            contacts.add(name);
                            List<String> list = Arrays.asList(name.split(" "));
                            System.out.println(list);
                            if(list.size() > 1){
                                trie.put(list.get(0)+list.get(1),name);
                                trie.put(list.get(1)+list.get(0),name);

                            }else{
                                trie.put(list.get(0),name);

                            }
                            break;
                        case 2:
                            final String searchTerm = console.readLine("%s", "Enter name:");
                            trie.prefixMap(searchTerm).forEach((k,v) -> System.out.println(v));
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
