package com.rabbit.samples.springreactiveweb.repos;

import com.rabbit.samples.springreactiveweb.domain.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeRepository {
	Flux<Employee> findAll();
	Mono<Employee> findById(final String id);
	Mono<Employee> update(final Employee employee);
}
