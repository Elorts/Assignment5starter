package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_list() {
		// Three A's
		
		//Arrange
		CustomList<Integer> customList = new CustomArrayList<>();
		
		//Act
		customList.add(10);
		
		//Assert
		assertEquals(10, customList.get(0));
		assertEquals(1, customList.getSize());
	}
	
	@Test
	void should_add_11_items_to_list () {
		//Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		
		
		//Act
		for(int i = 0; i < 100000; i++) {
			sut.add(i + 1);
		}
		
		//Assert
		assertEquals(100000, sut.getSize());
		for (int i = 0; i < 100000; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		
	}

}
