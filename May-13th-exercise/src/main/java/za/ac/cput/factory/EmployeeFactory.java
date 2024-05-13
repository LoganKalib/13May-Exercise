package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Employee;
import za.ac.cput.utils.Helper;

public class EmployeeFactory {
    public static Employee buildEmployee(Long emplyNo, String firstName, String lastName, Contact contact){
        if(Helper.testLong(emplyNo)
                && Helper.testString(firstName)
                && Helper.testString(lastName)
                && Helper.testContact(contact)){
            return new Employee.Builder()
                    .setEmployeeNumber(emplyNo)
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setContact(contact)
                    .build();
        }
        return null;
    }
    public static Employee buildEmployee(String firstName, String lastName, Contact contact){
        if(Helper.testString(firstName)
                && Helper.testString(lastName)
                && Helper.testContact(contact)){
            return new Employee.Builder()
                    .setEmployeeNumber(Helper.generateId())
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setContact(contact)
                    .build();
        }
        return null;
    }
    public static Employee buildEmployee(Long emplyNo){
        if(Helper.testLong(emplyNo)){
            return new Employee.Builder()
                    .setEmployeeNumber(emplyNo)
                    .build();
        }
        return null;
    }

    public static Employee buildEmployee(String firstName, String lastName){
        if(Helper.testString(firstName)
                && Helper.testString(lastName)){
            return new Employee.Builder()
                    .setEmployeeNumber(Helper.generateId())
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .build();
        }
        return null;
    }
    public static Employee buildEmployee(Long empNo ,String firstName, String lastName){
        if(Helper.testString(firstName)
                && Helper.testString(lastName)
                && Helper.testLong(empNo)){
            return new Employee.Builder()
                    .setEmployeeNumber(Helper.generateId())
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .build();
        }
        return null;
    }
    public static Employee buildEmployee(Long empNo , Contact contact){
        if(Helper.testContact(contact)
                && Helper.testLong(empNo)){
            return new Employee.Builder()
                    .setEmployeeNumber(Helper.generateId())
                    .setContact(contact)
                    .build();
        }
        return null;
    }
    public static Employee buildEmployee(Employee emp, Contact contact){
        if(Helper.testContact(contact)
                && Helper.testEmployee(emp)){
            return new Employee.Builder().copy(emp).setContact(contact).build();
        }
        return null;
    }
}
