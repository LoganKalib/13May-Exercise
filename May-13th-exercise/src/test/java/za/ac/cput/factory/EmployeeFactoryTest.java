package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Employee;
import za.ac.cput.utils.Helper;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeFactoryTest {

    Contact con;
    Employee emp;

    @Test
    @Order(1)
    void buildEmployee() {
        con = new Contact.Builder().setEmail("logan@gmail.com").build();

        emp = EmployeeFactory.buildEmployee(Helper.generateId(),
                "Logan", "Coghill", con);

        assertNotNull(emp);
        System.out.println(emp);
    }

    @Test
    @Order(2)
    void testBuildEmployee() {
        con = new Contact.Builder().setEmail("logan@gmail.com").build();

        emp = EmployeeFactory.buildEmployee("Logan", "Coghill", con);

        assertNotNull(emp);
        System.out.println(emp);
    }

    @Test
    @Order(3)
    void testBuildEmployee1() {
        emp = EmployeeFactory.buildEmployee(Helper.generateId());

        assertNotNull(emp);
        System.out.println(emp);
    }

    @Test
    @Order(4)
    void testBuildEmployeeFail() {
        emp = EmployeeFactory.buildEmployee(Helper.generateId(),
                "Logan", "Coghill", con);

        assertNotNull(emp);
        System.out.println(emp);
    }
}