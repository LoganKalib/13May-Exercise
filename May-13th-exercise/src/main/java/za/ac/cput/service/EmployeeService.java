package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Employee;
import za.ac.cput.repository.EmployeeRepository;

import java.util.List;
@Service
public class EmployeeService implements ImplEmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAllByEmployeeNumberAfterOrderByEmployeeNumber(Long id) {
        return employeeRepository.findAllByEmployeeNumberAfterOrderByEmployeeNumber(id);
    }

    @Override
    public Employee create(Employee obj) {
        return employeeRepository.save(obj);
    }

    @Override
    public Employee read(Long aLong) {
        return employeeRepository.findById(aLong).orElse(null);
    }

    @Override
    public void delete(Employee obj) {
        employeeRepository.delete(obj);
    }


    @Override
    public List<Employee> getall() {
        return employeeRepository.findAll();
    }
}
