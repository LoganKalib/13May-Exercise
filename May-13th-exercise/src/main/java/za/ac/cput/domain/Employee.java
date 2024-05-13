package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.Objects;

@Entity
public class Employee {
    @Id
    private long employeeNumber;
    @OneToOne
    private Contact contact;
    private String firstName;
    private String lastName;

    protected Employee(){

    }

    private Employee(Builder build) {
        this.employeeNumber = build.employeeNumber;
        this.firstName = build.firstName;
        this.lastName = build.lastName;
        this.contact = build.contact;
    }

    public long getEmployeeNumber() {
        return employeeNumber;
    }

    public Contact getContact() {
        return contact;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeNumber == employee.employeeNumber && Objects.equals(contact, employee.contact) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber, contact, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", contact=" + contact +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{
        private long employeeNumber;
        private Contact contact;
        private String firstName;
        private String lastName;

        public Builder setEmployeeNumber(long employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Employee obj){
            this.employeeNumber = obj.employeeNumber;
            this.firstName = obj.firstName;
            this.lastName = obj.lastName;
            this.contact = obj.contact;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
