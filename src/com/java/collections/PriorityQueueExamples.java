package com.java.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExamples {

	public static void main(String[] args) {

//		ORDER NOT MAINTAINED

//		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();//Internally use MinHeap: smallest element always at the top 
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());// Internally use MaxHeap:
																								// largest element
																								// always at the top

		queue.add(32);
		queue.add(3122);
		queue.add(32132);
		queue.add(312);
		queue.add(-2);
		queue.add(132);

		System.out.println(queue);
		System.out.println(queue.poll());

		System.out.println(queue);
		System.out.println(queue.poll());

		System.out.println(queue);
		System.out.println(queue.poll());

		System.out.println(queue);
		System.out.println(queue.poll());

		System.out.println(queue);
		System.out.println(queue.peek());

		System.out.println(queue);

	}

}
