package com.rohan.microservies.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * 
 * @author ROHAN
 * This class is used to read properties from properties file
 */
@ConfigurationProperties("limits-service") // this annotation is required to get the values from properties file of the given prefix
@Component
public class Configuration {

	private int maximum; // this must be same as what is defined in application.properties file
	private int minimum; // this must be same as what is defined in application.properties file
	
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
}
