package com.java.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest3 {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(6);
		queue.offer(3);
		queue.offer(8);
		queue.offer(2);
		for (int i = 0; i < 4; i++)
			System.out.print(queue.poll() + " ");
	}
}
