package com.github.yashk.contacts;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by yashk on 6/11/16.
 */
public class Main {

    public static void main(String args[]){
        
        Console console = System.console();
        List<String> contacts = new ArrayList<String>();
        if(console!=null){
            String line;
            while((line=console.readLine("%s","1) Add contact 2) Search 3) Exit\n"))!=null) {

                try {
                    switch (Integer.parseInt(line)) {
                        case 1:
                            contacts.add(console.readLine("%s", "Enter name:"));
                            break;
                        case 2:
                            final String searchTerm = console.readLine("%s", "Enter name:");
                            contacts.stream().filter(s -> s.contains(searchTerm)).forEach(System.out::println);
                            break;
                        case 3:
                            console.printf("%s", "Happy Searching");
                            return;
                    }

                }catch (NumberFormatException e){
                    System.out.println("valid input 1 or 2 or 3");
                }
            }

        }
    }
}
