package com.java.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest4 {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.offer("B");
		queue.offer("G");
		queue.offer("b");
		queue.offer("A");
		queue.offer("С��");
		queue.offer("С��");
		queue.offer("С��");
		queue.offer("��");
		for (int i = 0; i < 8; i++)
			System.out.print(queue.poll() + " ");
	}
}
