package com.java.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest5 {
	public static void main(String[] args) {
		Queue<Patient> queue = new PriorityQueue<Patient>();
		queue.offer(new Patient("小明", "普通1号"));
		queue.offer(new Patient("小红", "普通2号"));
		queue.offer(new Patient("小东", "紧急1号"));
		queue.offer(new Patient("小花", "普通3号"));
		queue.offer(new Patient("小米", "紧急2号"));
		for (int i = 0; i < 5; i++)
			System.out.print(queue.poll().name + " ");
	}
}

class Patient implements Comparable<Patient> {
	String name;
	String ticket;

	public Patient(String name, String ticket) {
		this.name = name;
		this.ticket = ticket;
	}

	public int compareTo(Patient o) {
		if (this.ticket.startsWith("普通") && o.ticket.startsWith("紧急"))
			return 1;
		if (this.ticket.startsWith("紧急") && o.ticket.startsWith("紧急"))
			return 0;
		return -1;
	}
}