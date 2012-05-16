/*
 * Copyright 2012 FuseSource
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fusesource.examples.plugin.germanairline;

import com.fusesource.examples.booking.spi.BookingProcessor;

public class GermanAirlinePlugin implements BookingProcessor {

	private final static String AIRLINE_CODE = "DE";

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