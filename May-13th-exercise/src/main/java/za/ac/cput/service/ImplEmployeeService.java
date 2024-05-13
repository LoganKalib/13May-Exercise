package za.ac.cput.service;

import za.ac.cput.domain.Employee;

import java.util.List;

public interface ImplEmployeeService extends ImplService<Employee, Long>{
    public List<Employee> findAllByEmployeeNumberAfterOrderByEmployeeNumber(Long id);
}
