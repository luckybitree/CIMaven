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

@Test

public void test2(){

	MainFunction1 testFunction2 = new MainFunction1();
	
	testFunction2.setName("Mary");
	testFunction2.getName();
	testFunction2.walk();

}

}
