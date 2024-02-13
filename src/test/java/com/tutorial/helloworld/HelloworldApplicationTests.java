package com.tutorial.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.tutorial.helloworld.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHelloWorld() {
		String expected = "Hello World!";

		String result = bs.getHelloWorld().getValue();

		assertEquals(expected, result);
	}

}
