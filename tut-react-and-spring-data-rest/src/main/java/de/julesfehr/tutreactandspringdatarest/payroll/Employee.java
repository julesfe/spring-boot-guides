package de.julesfehr.tutreactandspringdatarest.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// @Data: Project Lombok annotation to autogenerate getters, setters, constructors,
// toStrings, hash, equals, and other things. Cuts down on the boilerplate.
@Data
// @Entity: JPA annotation that denotes the whole class for storage in a relational table.
@Entity
/**
 * This entity is used to track employee information (name, job description)
 */
public class Employee {

    // @Id, @GeneratedValue: JPA annotations to note the primary key and that it will be
    // automatically generated when needed.
    private @Id @GeneratedValue Long Id;
    private String firstName;
    private String lastName;
    private String description;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}
