package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//Essa classe deve concentrar o mapeamento das Propriedades de configuração de cada um dos serviços.
@Component
@ConfigurationProperties("limits-service")
public class Configuration {

private int minimum;
private int maximum;


public Configuration() {
	super();
	// TODO Auto-generated constructor stub
}


public Configuration(int minimum, int maximum) {
	super();
	this.minimum = minimum;
	this.maximum = maximum;
}


public int getMinimum() {
	return minimum;
}
public void setMinimum(int minimum) {
	this.minimum = minimum;
}
public int getMaximum() {
	return maximum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}




	
}
