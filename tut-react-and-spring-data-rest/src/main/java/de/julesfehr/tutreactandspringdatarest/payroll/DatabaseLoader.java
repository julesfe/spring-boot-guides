package de.julesfehr.tutreactandspringdatarest.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// @Component: Spring annotation that gets this component picked up
// automatically by @SpringBootApplication.
@Component
/**
 * Pre-loading the demo with data.
 *
 * Implements SpringBoot's CommandLineRunner so that it gets run
 * after all the beans are created and registered.
 */
public class DatabaseLoader implements CommandLineRunner{

    private final EmployeeRepository repository;

    // Use constructor injection and autowiring to get Spring Data's
    // automatically created EmployeeRepository.
    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    // run() method is invoked with command line arguments to load up the data.
    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}
