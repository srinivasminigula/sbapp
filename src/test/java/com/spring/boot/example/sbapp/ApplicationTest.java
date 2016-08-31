package com.spring.boot.example.sbapp;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

import com.spring.boot.example.sbapp.controller.HomeController;

/**
 * Unit test for simple App.
 */
public class ApplicationTest {
	@InjectMocks
	HomeController hc;

	@Test
	public void mockControllerTest() {
		hc.getHomePage();
	}

	@Test
	public void test() {
		Assert.assertEquals(new HomeController().getHomePage(),
				"Hello Spring BOOT World!!");
	}

}
