package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.InsertInSortedList;

public class App 
{
	public static void main( String[] args )
    {
		int[] listData = {1,3,5,9};
		Node head = new Node(listData[0]);
		for(int count = 1; count < listData.length; count++)
			InsertInSortedList.prepareList(head,listData[count]);
		
		System.out.printf("Linked list is : ");
		InsertInSortedList.print(head);
		
		int newData = 4;
		Node newNode = new Node(newData);
		head = InsertInSortedList.insert(head, newNode);
		System.out.printf("Linked list after inserting %d : ",newData);
		InsertInSortedList.print(head);
		
		newData = 7;
		newNode = new Node(newData);
		head = InsertInSortedList.insert(head, newNode);
		System.out.printf("Linked list after inserting %d : ",newData);
		InsertInSortedList.print(head);
    }
}
