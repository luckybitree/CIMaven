package com.mit.citest;

import org.testng.annotations.Test;
import com.mit.cifunctions.*;

public class TestMainFunction1 {
	
	
@Test

public void test1(){
	
	MainFunction1 testFunction1 = new MainFunction1();
	
	testFunction1.setName("Tom");
	testFunction1.getName();
	testFunction1.run();
	
}

}
