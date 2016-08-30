package com.b5c.www.Hello_World;

import static org.junit.Assert.*;
import com.b5c.www.Hello_World.*;
import org.junit.AfterClass;
import org.junit.Test;

public class HelloTest {

	public HelloTest() {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Hello hello = new Hello();
		String res = hello.SayHello();
		assertEquals("hello maven输出不对","Hello maven",res);
	}

}
