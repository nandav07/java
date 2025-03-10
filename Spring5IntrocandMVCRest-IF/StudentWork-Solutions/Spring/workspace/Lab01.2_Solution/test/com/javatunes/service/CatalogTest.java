/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright LearningPatterns Inc.
 */
 
package com.javatunes.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CatalogTest {

	@Test
	public void testCatalogLookupPositive() {
		// DONE: pass applicationContext.xml to the constructor
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull("spring container should not be null", ctx);
		// DONE:
		/*
		 * Look up the musicCatalog, 
		 * assert that it's not null
	     * and invoke its toString method.  
		 * Don't forget to close spring context
		 */		
		Catalog cat = ctx.getBean(Catalog.class);
		assertNotNull("Catalog should not be null", cat);
		System.out.println(cat.toString());
		ctx.close();
	}
	
	// TODO: Not until Dependency Injection Lab - annotate as test method
	public void testCatalogPositive() {
		// TODO: Create the context, lookup the catalog.
		// TODO: DI Lab - call the size method test that it's greater than zero, and output its value
		// TODO: DI Lab - call the findByKeyword method with "a", test that there is at least 
		// one item found, and output the found items
		// TODO: Close the context.
	}
}
