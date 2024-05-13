package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/createOrUpdate")
    public Employee create(@RequestBody Employee obj){
        Contact contact = ContactFactory.buildContact(obj.getContact().getEmail());
        Employee employee = EmployeeFactory.buildEmployee(obj.getEmployeeNumber()
                , obj.getFirstName()
                , obj.getLastName()
                , contact);
        return employeeService.create(employee);
    }

    @GetMapping("/idsAfter/{id}")
    public List<Employee> findAllByEmployeeNumberAfterOrderByEmployeeNumber(@PathVariable Long id) {
        return employeeService.findAllByEmployeeNumberAfterOrderByEmployeeNumber(id);
    }
    @GetMapping("/read/{aLong}")
    public Employee read(@PathVariable Long aLong) {
        return employeeService.read(aLong);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        Employee obj = EmployeeFactory.buildEmployee(id);
        employeeService.delete(obj);
    }
    @GetMapping("/getAll")
    public List<Employee> getall() {
        return employeeService.getall();
    }

}
