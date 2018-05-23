package com.nitish.runner;

import javax.xml.ws.Endpoint;

import com.nitish.soap.CustomerServiceImpl;

public class Publisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/customer", new CustomerServiceImpl());
		System.out.println("done");
	}

}
