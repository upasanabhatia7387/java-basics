package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	//FIFO
	public static void main(String[] args) {
		Queue <Integer> queue = new LinkedList<>();
		
		for (int i=0; i<=5; i++) {
			queue.add(i);
		}
		
		System.out.println(queue);
		System.out.println("=============");
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.peek()); //it retrives top element from the queue
		System.out.println("==============");
		System.out.println(queue);
		System.out.println("==============");
		System.out.println(queue.poll()); //it retrives top element from the queue and remove also.
		System.out.println("==============");
		System.out.println(queue);
	
		

	}

}
