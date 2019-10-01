package edu.ca.ets;

import static java.lang.String.format;

/**
 * Hello world!
 *
 */
public class Greeter 
{
    public String greet(String name) {
	System.out.println("greet was called with param " + name);
        return format("Greetings %s!How are you doing today?", name);
    }
}
