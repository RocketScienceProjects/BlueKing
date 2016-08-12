/**
 * 
 */
package com.blueking.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Arun Pro
 *
 */
public class BlueKingHelloWorldTest {
	@Test
	public void HelloWorldTest(){
		BluekingHelloWorld bluekingHelloWorld = new BluekingHelloWorld();
		ModelAndView modelAndView = bluekingHelloWorld.helloWorld();
		Assert.assertEquals("welcome", modelAndView.getViewName());
	}
}
