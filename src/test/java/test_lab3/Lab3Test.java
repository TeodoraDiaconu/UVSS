package test_lab3;

import agenda.exceptions.InvalidFormatException;
import agenda.model.base.Contact;
import agenda.model.repository.classes.RepositoryContactFile;
import agenda.model.repository.interfaces.RepositoryContact;
import agenda.startApp.MainClass;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class Lab3Test {

    private RepositoryContact rep;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setup() throws Exception {
        rep = new RepositoryContactFile();
    }

    @Test
    public void TC1() throws InvalidFormatException {
        Contact c = new Contact("Maria","Bucuresti", "+40741133371");
        rep.addContact(c);
        String name ="Maria";
        Object o = MainClass.afisareContacte(rep, name);
        assert o == c;
    }

    @Test
    public void TC2(){
        String name ="nume!";
        Object o = MainClass.afisareContacte(rep, name);
        assert o.equals("Invalid name");

    }
    @Test
    public void TC3(){
        String name = null;
        Object o = MainClass.afisareContacte(rep, name);
        assert o == null;
    }
}
