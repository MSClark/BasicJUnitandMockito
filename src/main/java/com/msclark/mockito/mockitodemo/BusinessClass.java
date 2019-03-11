package com.msclark.mockito.mockitodemo;

public class BusinessClass {
	private DataService dataService;
	
	public BusinessClass(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findLargestDatum() {
		int[] data = dataService.getData();
		int largest = Integer.MIN_VALUE;
		for(int value : data) {
			if(value > largest) {
				largest = value;
			}
		}
		return largest;
	}
}