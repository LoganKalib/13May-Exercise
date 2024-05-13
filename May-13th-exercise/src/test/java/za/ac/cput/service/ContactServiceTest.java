package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ContactServiceTest {

    @Autowired
    private ContactService contactService;

    @Test
    void create() {
        for(int i =0; i<2;i++){
            Contact con = ContactFactory.buildContact("Email" + i + "@gmail.com");
            assertEquals(con, contactService.create(con));
        }
    }

    @Test
    void read() {
    }

    @Test
    void delete() {
    }

    @Test
    void getall() {
    }
}