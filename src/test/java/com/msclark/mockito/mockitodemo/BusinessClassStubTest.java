package com.msclark.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessClassStubTest {

	@Test
	public void findLargestDatum() {
		BusinessClass businessClass = new BusinessClass(new DataServiceStub());
		int result = businessClass.findLargestDatum(); 	
		assertEquals(24,result);
	}
}

class DataServiceStub implements DataService{

	@Override
	public int[] getData() {
		return new int[] {24,6,15};
	}
	
}
