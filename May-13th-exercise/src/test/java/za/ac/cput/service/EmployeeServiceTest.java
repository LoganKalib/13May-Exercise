package za.ac.cput.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Contact;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.domain.Employee;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void findAllByEmployeeNumberAfterOrderByEmployeeNumber() {
    }

    @Test
    void create() {
        for(int i =0; i<2;i++){
            Employee emp = EmployeeFactory.buildEmployee("Smith" + i, "Smithy" + i);
            assertEquals(emp, employeeService.create(emp));
        }

    }

    @Test
    void read() {
        Employee emp = employeeService.read(650321617765680197L);
        assertNotNull(emp);
        assertEquals(650321617765680197L, emp.getEmployeeNumber());
        System.out.println(emp);
    }

    @Test
    void delete() {
        employeeService.delete(employeeService.read(650321617765680197L));
        assertNull(employeeService.read(650321617765680197L));
    }

    @Test
    void getall() {
        List<Employee> arr = employeeService.getall();
        assertNotNull(arr);
        System.out.println(arr);
    }

    @Test
    void update(){
        Contact con = new Contact.Builder().setEmail("221534067@mycput.ac.za").build();
        Employee emptest = employeeService.read(8398218770544938868L);
        Employee emp = EmployeeFactory.buildEmployee(emptest,con);
        assertNotEquals(emp,employeeService.create(emp));

        System.out.println(employeeService.getall());
    }
}