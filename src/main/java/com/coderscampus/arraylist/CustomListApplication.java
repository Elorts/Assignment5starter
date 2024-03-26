package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		
		CustomList<String> myCustomList = new CustomArrayList<>();
	
		System.out.println("CustomArrayList size before addition of elements: " + myCustomList.getSize());
		
		// Add elements
		for (int i = 0; i < 40; i++) {
			myCustomList.add("element " + (i + 1));
		}
		
		System.out.println("CustomArrayList size after addition of elements: " + myCustomList.getSize());
		
		// Print elements from CustomArrayList
		for (int j = 0; j < myCustomList.getSize(); j++) {
			System.out.println(myCustomList.get(j));
		}

	}

}
