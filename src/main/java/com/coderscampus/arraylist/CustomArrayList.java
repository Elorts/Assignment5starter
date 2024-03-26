package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Integer arrayListSize = 10;
	Integer itemIndex = 0; 
	Object[] items = new Object[arrayListSize];

	@Override
	public boolean add(T item) {
		
		try {
			
			if (itemIndex == arrayListSize) {
				arrayListSize *= 2; 
				
				Object[] tempArray = new Object[arrayListSize]; 
				
				for (int i = 0; i < items.length; i++) {
					tempArray[i] =  items[i];
				}
				
				items = tempArray;
			}
			
			items[itemIndex] = item;
			
			itemIndex++;
			return true;
		} catch (Exception e) {
			System.out.println("Error!");
			return false;
		}
	}

	@Override
	public int getSize() {
		return itemIndex;
	}

	@Override
	public T get(int index) {
		return (T) items[index];
	}
	
}
