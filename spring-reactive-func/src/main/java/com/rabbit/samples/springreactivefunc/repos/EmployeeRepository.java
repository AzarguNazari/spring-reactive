package com.rabbit.samples.springreactivefunc.repos;

import com.rabbit.samples.springreactivefunc.domain.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeRepository {
	Flux<Employee> findAll();
	Mono<Employee> findById(final String id);
	Mono<Employee> update(final Employee employee);
}
