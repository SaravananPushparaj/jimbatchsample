package samplepackage;

import org.testng.annotations.Test;

public class test {

	@Test	(groups ={"smoketest"})
	public void testex()
	{
		System.out.println("This is version 1 code");
		
		System.out.println("Adding is version 2 code");
	}

}
