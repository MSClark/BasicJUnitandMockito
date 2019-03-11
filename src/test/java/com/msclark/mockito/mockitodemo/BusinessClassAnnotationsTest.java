package com.msclark.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BusinessClassAnnotationsTest {

	@Mock
	DataService dataServiceMock; 
	// ^ replaces this - DataService dataServiceMock = mock(DataService.class);

	@InjectMocks
	BusinessClass businessClass;
	// ^ replaces this - BusinessClass businessClass = new BusinessClass(dataServiceMock);
	
	
	@Test
	public void findLargestDatum() {
		when(dataServiceMock.getData()).thenReturn(new int[] {24,15,3});
		assertEquals(24,businessClass.findLargestDatum());
	}
}
