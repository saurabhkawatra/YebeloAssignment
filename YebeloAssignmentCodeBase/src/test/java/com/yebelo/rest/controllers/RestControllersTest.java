package com.yebelo.rest.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RestControllersTest {
	
	private RestControllers restControllers;

	@Test
	void testGetNumOfDigits() {
		assertThat(restControllers.getNumOfDigits(12345)).isEqualTo(5);
	}

	@Test
	void testSumOfDigits() {
		assertThat(restControllers.sumOfDigits(12345,5)).isEqualTo(15);
	}

}
