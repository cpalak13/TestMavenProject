package com;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestListener {
	
	public static void main(String[] args) {	
		
				TestNG testng = new TestNG();
				List<String> suites = new ArrayList<String>();
				suites.add("./testng.xml");//path to xml..
					
				testng.setTestSuites(suites);
				testng.run();
			}
}
