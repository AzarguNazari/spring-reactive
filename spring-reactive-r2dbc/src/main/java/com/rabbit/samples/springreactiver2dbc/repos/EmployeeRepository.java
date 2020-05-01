package com.rabbit.samples.springreactiver2dbc.repos;

import com.rabbit.samples.springreactiver2dbc.domain.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}
