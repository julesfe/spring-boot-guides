package de.julesfehr.tutreactandspringdatarest.payroll;

import org.springframework.data.repository.CrudRepository;

/**
 * Corresponding repository definition to Employee Entity.
 * Key Piece of a Spring Data REST application. This repository
 * extends Spring Data Commons' CrudRepository and plugs in the type
 * of the domain object and its primary key.
 *
 * To define your own repository:
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.definition
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    // Spring Data looks at the name of methods in a repository class and
    // figures out the operation you need including saving, deleting, and finding.
    //
    // That is how we can write an empty interface and inherit already built save, find, and delete operations.
}
