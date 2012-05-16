package com.fusesource.examples.flights;

import java.util.Set;
import com.fusesource.examples.booking.spi.BookingProcessor;

public class BookingProcessorRegistry {
	private Set<BookingProcessor> bookingProcessors;

	public void setBookingProcessors(Set<BookingProcessor> bookingProcessors) {
		this.bookingProcessors = bookingProcessors;
	}

	public boolean isAirlineSupported(String flightNumber) {
		boolean airlineSupported = false;
		if (bookingProcessors != null) {
			for (BookingProcessor bookingProcessor : bookingProcessors) {
				String airlineCode = null;
				try {
					airlineCode = bookingProcessor.getAirlineCode();
				} catch (Exception ex) {
					// the service has gone away
					continue;
				}
				if (flightNumber.startsWith(airlineCode)) {
					airlineSupported = true;
					break;
				}
			}
		}
		return airlineSupported;
	}

	public String getBookingProcessorUri() {
		String routeUri = null;
		if (bookingProcessors != null) {
			for (BookingProcessor bookingProcessor : bookingProcessors) {
				try {
					routeUri = bookingProcessor.getRouteUri();
				} catch (Exception ex) {
					// the service has gone away
					continue;					
				}
			}
		}
		return routeUri;
	}
}