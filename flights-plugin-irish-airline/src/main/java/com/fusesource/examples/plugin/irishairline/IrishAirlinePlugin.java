package com.fusesource.examples.plugin.irishairline;

import com.fusesource.examples.booking.spi.BookingProcessor;

public class IrishAirlinePlugin implements BookingProcessor {

	private final static String AIRLINE_CODE = "IE";

	private String routeUri;
	private String message;

	public String getAirlineCode() {
		return AIRLINE_CODE;
	}

	public void setRouteUri(String routeUri) {
		this.routeUri = routeUri;
	}

	public String getRouteUri() {
		return routeUri;
	}

	public void setMessage(String message) {
		this.message = message;
	}	

	public String getMessage() {
		return this.message;
	}
}