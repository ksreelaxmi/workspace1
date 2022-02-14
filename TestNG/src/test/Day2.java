package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public static void method1() {
		System.out.println("XYZ---");
	}
	
	@AfterTest
	public void method3() {
		System.out.println("I will execute last in this test scope");
	}
	
	@Test(groups={"Smoke"})
	public void method2() {
		System.out.println("welcome==");
	}

}
