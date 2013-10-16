package org.data4j.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application class starts the application
 * 
 * @author data4j.org
 * @since 16 Oct 2013
 * @version 1.0.0
 *
 */
public class Application {

	/**
     * Starts the application
     *
     * @param  String[] args
     *
     */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
