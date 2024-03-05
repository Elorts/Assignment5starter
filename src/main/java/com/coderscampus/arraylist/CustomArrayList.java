package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Integer capacity = 10;
	Integer size = 0;
	Object[] items = new Object[capacity];

	@Override
	public boolean add(T item) {
		
		try {
			
			if (size == capacity) {
				capacity *= 2;
				items = Arrays.copyOf(items, capacity);
			}
			
			items[size] = item;
			
			size++;
			return true;
		} catch (Exception e) {
			System.out.println("Error!");
			return false;
		}
	}

	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		return (T) items[index];
	}
}
