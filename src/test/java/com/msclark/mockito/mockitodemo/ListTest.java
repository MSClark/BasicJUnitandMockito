package com.msclark.mockito.mockitodemo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class ListTest {

	@Test
	public void testSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}
	
	@Test
	public void testSizeMultipleReturns() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
	}
	
	@Test
	public void testGet() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("someString");
		assertEquals("someString", listMock.get(0));
	}
}
