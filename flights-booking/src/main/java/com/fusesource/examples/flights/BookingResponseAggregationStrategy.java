package com.fusesource.examples.flights;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class BookingResponseAggregationStrategy implements AggregationStrategy {

	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		if (oldExchange == null) {
			return newExchange;
		} else {
			oldExchange.getIn().setBody(
					oldExchange.getIn().getBody(String.class) + ";" 
					+ newExchange.getIn().getBody(String.class));
			return oldExchange;
		}
	}
}