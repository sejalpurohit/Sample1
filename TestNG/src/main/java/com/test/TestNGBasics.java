package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup properties for chrome");		
	}
	
	@BeforeTest
	public  void launchBrowser() {
		System.out.println("Laumch Browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("Login to app");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logut from app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Delete all cookies");
	}
	@AfterSuite
	public void generateTestReport() {
		System.out.println("Generate Test Report");
	}
}
