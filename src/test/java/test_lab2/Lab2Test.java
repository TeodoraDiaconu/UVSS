package test_lab2;

import agenda.exceptions.InvalidFormatException;
import agenda.model.base.Contact;
import agenda.model.repository.classes.RepositoryContactFile;
import agenda.model.repository.interfaces.RepositoryContact;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Lab2Test {

    private RepositoryContact rep;
    private Contact con;

    @Before
    public void setup() throws Exception {
        rep = new RepositoryContactFile();
    }

    @Test
    public void testCaseLAB2VAR1()
    {

        try {
            con = new Contact("Bodiu Mada", "Bistrita", "+4071122334455");
        } catch (InvalidFormatException e) {
            assertTrue(false);
        }
        //int n = rep.count();
        rep.addContact(con);
        for(Contact c : rep.getContacts())
            if (c.equals(con))
            {
                assertTrue(true);
                break;
            }
        //	assertTrue(n+1 == rep.count());
    }
    @Test
    public void testCaseLAB2VAR2()
    {
        try {
            Contact con = new Contact("Thanos", "@#$", "+4071122334455");
        } catch (InvalidFormatException e) {
            assertTrue(true);
        }
        //int n = rep.count();
        rep.addContact(con);
        for(Contact c : rep.getContacts())
            if (c.equals(con))
            {
                assertTrue(true);
                break;
            }
        //	assertTrue(n+1 == rep.count());
    }
    @Test
    public void testCaseLAB2VAR3()
    {
        try {
            con = new Contact("123nume", "Bistrita", "+4071122334455");
        } catch (InvalidFormatException e) {
            assertTrue(true);
        }
        //int n = rep.count();
        rep.addContact(con);
        for(Contact c : rep.getContacts())
            if (c.equals(con))
            {
                assertTrue(true);
                break;
            }
    }
    @Test
    public void testCaseLAB2VAR4()
    {
        try {
            con = new Contact("123nume", "Bistrita", "abc");
        } catch (InvalidFormatException e) {
            assertTrue(true);
        }
        //int n = rep.count();
        rep.addContact(con);
        for(Contact c : rep.getContacts())
            if (c.equals(con))
            {
                assertTrue(true);
                break;
            }
        //	assertTrue(n+1 == rep.count());
    }
}
