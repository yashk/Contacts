package com.github.yashk.contacts;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by ykochare on 6/12/16.
 */
public class ContactParsingTest {


    @Test
    public void contactLongerThan50Chars(){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<52;i++) {
            builder.append("y");
        }
        assertThatThrownBy(() -> {Contact.parse(builder.toString()); }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void nullContactNotAllowed(){
        assertThatThrownBy(()->{Contact.parse(null);}).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void onlyFirstNameParsing(){
        final Contact contact = Contact.parse("yash");
        assertThat(contact.getFirstName()).isEqualTo("yash");
        assertThat(contact.getLastName()).isEmpty();
    }

    @Test
    public void correctParsing(){
        final Contact contact = Contact.parse("yash sharma");
        assertThat(contact.getFirstName()).isEqualTo("yash");
        assertThat(contact.getLastName()).isEqualTo("sharma");

    }


}
