package org.learn.Client;

import org.learn.Question.InsertInSortedList;
import org.learn.Question.Node;

public class SingleLinkedListClient {
	
	public static void main(String[] args) {
		
		int[] listData = { 1, 3, 5, 9 };
		Node head = new Node(listData[0]);
		
		for (int count = 1; count < listData.length; count++) {
			InsertInSortedList.prepareList(head, listData[count]);
		}
		
		System.out.printf("1. Single linked list is : ");
		InsertInSortedList.print(head);

		int newData = 4;
		Node newNode = new Node(newData);
		head = InsertInSortedList.insert(head, newNode);
		System.out.printf("2. Single linked list after inserting %d  is : ", newData);
		InsertInSortedList.print(head);

		newData = 7;
		newNode = new Node(newData);
		head = InsertInSortedList.insert(head, newNode);
		System.out.printf("3. Single linked list after inserting %d is : ", newData);
		InsertInSortedList.print(head);
	}
}
