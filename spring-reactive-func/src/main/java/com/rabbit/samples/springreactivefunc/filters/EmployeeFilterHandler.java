package com.rabbit.samples.springreactivefunc.filters;

import com.rabbit.samples.springreactivefunc.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.server.ServerRequest;

@Slf4j
public class EmployeeFilterHandler extends ObjectFilterHandler {

	@Override
	Object getBodyObject(final ServerRequest serverRequest) {
		return serverRequest.bodyToMono(Employee.class).toProcessor().peek();
	}

}
