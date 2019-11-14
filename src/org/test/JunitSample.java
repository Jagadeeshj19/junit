package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class JunitSample {
	@BeforeClass
public static void launchBrowser() {
	System.out.println("Launch");
}
	@Before
	public void StartTime() {
		System.out.println("Start");
	}
	@Test
	public void aTest() {
	Assert.assertTrue(true);
	Assert.assertTrue(true);
	Assert.assertTrue(true);
	
		System.out.println("A");
	}
	@Test
	public void bTest() {
		Assert.assertTrue(true);
		System.out.println("B");
	}
	@Test
	public void cTest() {
		Assert.assertTrue(true);
		
		System.out.println("C");
	}
	@Test
	public void runTest() {Assert.assertTrue(true);
		System.out.println("Run");
	}
	@After
	public void EndTime() {
		System.out.println("End");
	}
	@AfterClass
	public static void closeBrowser() {
		System.out.println("Close");
	}

}
