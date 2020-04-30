package com.rabbit.samples.springreactivefunc.filters;

import com.rabbit.samples.springreactivefunc.domain.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.server.ServerRequest;


@Slf4j
public class EventFilterHandler extends ObjectFilterHandler {

	@Override
	Object getBodyObject(final ServerRequest serverRequest) {
		return serverRequest.bodyToMono(Event.class).toProcessor().peek();
	}

}
