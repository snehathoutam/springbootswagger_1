package com.javainuse;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:/Users/komal/inputFolder?noop=true").to("file:C:/Users/komal/outputFolder");
	}
}