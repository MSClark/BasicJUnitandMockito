package com.msclark.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.Test;

public class BusinessClassMockTest {

	@Test
	public void findLargestDatum() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.getData()).thenReturn(new int[] {24,15,3});
		
		BusinessClass businessClass = new BusinessClass(dataServiceMock);
		int result = businessClass.findLargestDatum(); 	
		assertEquals(24,result);
	}
}
